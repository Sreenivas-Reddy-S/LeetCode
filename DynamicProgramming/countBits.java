package Dynamic_Programming;

public class countBits {
    public static void main(String[] args) {
        int[] arr = countBits(5);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static int[] countBits(int num) {
        int[] dp = new int[num+1];
        dp[0] = 0;
        for(int i = 1; i <= num; i++){
            if(i % 2 == 0){
                dp[i] = dp[i/2];
            }else{
                dp[i] = dp[i/2] + 1;
            }
        }
        return dp;
    }
}
