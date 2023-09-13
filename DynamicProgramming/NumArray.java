package Dynamic_Programming;

public class NumArray {
    int[] dp;
    public NumArray(int[] nums) {
        dp = new int[nums.length];
        if(nums.length > 0){
            dp[0] = nums[0];
        }
        for(int i = 1; i < nums.length; i++){
            dp[i] = dp[i-1] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        if(i == 0){
            return dp[j];
        }
        return dp[j] - dp[i-1];
    }
}
