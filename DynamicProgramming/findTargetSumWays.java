package Dynamic_Programming;

import java.util.Arrays;

public class findTargetSumWays {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        System.out.println(findTargetSumWays(arr, 3));
    }

    public static int findTargetSumWays(int[] nums, int Target) {
        int sum = 0;
        for(int i : nums){
            sum += i;
        }

        if(sum < Target || (sum + Target) % 2 == 1){
            return 0;
        }

        int target = (sum + Target) / 2;
        int[] dp = new int[target+1];
        dp[0] = 1;
        for (int num : nums) {
            for (int j = target; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }
        return dp[target];
    }
}
