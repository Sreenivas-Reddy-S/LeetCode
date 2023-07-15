package Strings;

public class findNumberOfWays {
    public static void main(String[] args) {
        int intervals = 2;
        int processes = 1;
        System.out.println(findNumberOfWays(intervals, processes));
    }

    public static int findNumberOfWays(int intervals, int processes){
        int[] dp = new int[intervals + 1];
        dp[0] = 1;
        for(int i = 1; i <= intervals; i++){
            dp[i] = dp[i - 1] * processes;
        }
        return dp[intervals] -1 ;
    }
}
