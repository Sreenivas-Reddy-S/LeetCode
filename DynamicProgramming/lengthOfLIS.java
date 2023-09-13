package Dynamic_Programming;

// O(n^2) time, O(n) space
public class lengthOfLIS {
    public static void main(String[] args) {
        int[] arr = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(arr));
    }

    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int max = 0;
//        loop through the array
        for(int i = 0; i < nums.length; i++){
            dp[i] = 1;
//            loop through all the previous elements
            for(int j = 0; j < i; j++){
//                if the current element is greater than the previous element
                if(nums[i] > nums[j]){
//                    update the dp array
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
//            update the max value
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}