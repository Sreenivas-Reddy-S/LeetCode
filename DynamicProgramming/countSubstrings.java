package Dynamic_Programming;

public class countSubstrings {
    public static void main(String[] args) {
        System.out.println(countSubstrings("aaaaa"));
    }

    public static int countSubstrings(String s) {
        int n = s.length();
        int res = 0;
        boolean[][] dp = new boolean[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                if(s.charAt(i) == s.charAt(j) && (i - j <= 2 || dp[j+1][i-1])){
                    dp[j][i] = true;
                    res++;
                }
            }
        }
        return res;
    }
}
