package Strings;

public class countSubstrings {
    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(countSubstrings(s));
    }

    public static int countSubstrings(String s){
        int result = 0;
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                if(s.charAt(i) == s.charAt(j) && (i - j <= 2 || dp[i - 1][j + 1])){
                    dp[i][j] = true;
                    result++;
                }
            }
        }
        return result;
    }
}

