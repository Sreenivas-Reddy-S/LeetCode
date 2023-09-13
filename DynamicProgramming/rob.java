package Dynamic_Programming;

public class rob {
    //    House Robber - 2
    public static void main(String[] args) {
        int[] nums = {2, 3, 2};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        return Math.max(dp(nums, 0, nums.length - 2), dp(nums, 1, nums.length - 1));
    }

    public static int dp(int[] nums, int start, int end) {
        int[] dp = new int[nums.length];
        dp[start] = nums[start];
        dp[start + 1] = Math.max(nums[start], nums[start + 1]);
        for (int i = start + 2; i <= end; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[end];
    }
}

//    House Robber -1


//    public static void main(String[] args) {
//        int[] arr = {2,7,9,3,1};
//        System.out.println(rob(arr));
//    }
//
//    public static int rob(int[] nums) {
//        if(nums.length == 0){
//            return 0;
//        }
//        if(nums.length == 1){
//            return nums[0];
//        }
//        int[] dp = new int[nums.length];
//        dp[0] = nums[0];
//        dp[1] = Math.max(nums[0], nums[1]);
//        for(int i = 2; i < nums.length; i++){
//            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
//        }
//        return dp[nums.length-1];
//    }
