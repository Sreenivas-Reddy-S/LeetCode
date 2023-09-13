package Dynamic_Programming;

import java.util.Arrays;

public class combinationSum4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(combinationSum4(arr, 4));
    }

    public static int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        dp[0] = 1;
        for(int i = 1; i <= target; i++){
            for (int num : nums) {
                if (i >= num) {
                    dp[i] += dp[i - num];
                    System.out.println(Arrays.toString(dp));
                }
            }
//            System.out.println(Arrays.toString(dp));
        }
        return dp[target];
    }
}
