package Dynamic_Programming;

public class longestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }

    public static String longestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return "";
        }
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int max = 0;
        String res = "";
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                if(s.charAt(i) == s.charAt(j) && (i - j <= 2 || dp[j+1][i-1])){
                    dp[j][i] = true;
                        if(i - j + 1 > max){
                        max = i - j + 1;
                        res = s.substring(j, i + 1);
                    }
                }
            }
        }
        return res;
    }
}
