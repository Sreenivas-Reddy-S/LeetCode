package Dynamic_Programming;

public class maxSubArray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(sum < 0){
                sum = nums[i];
            }else{
                sum += nums[i];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
