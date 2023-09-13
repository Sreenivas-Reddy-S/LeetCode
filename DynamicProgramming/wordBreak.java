package Dynamic_Programming;

public class wordBreak {
    public static void main(String[] args) {
        String s = "catsandog";
        String[] wordDict = {"cats","dog","sand","and","cat"};
        System.out.println(wordBreak(s, wordDict));
    }

    public static boolean wordBreak(String s, String[] wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for(int i = 1; i <= s.length(); i++){
            for(int j = 0; j < i; j++){
                if(dp[j] && contains(s.substring(j, i), wordDict)){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    public static boolean contains(String s, String[] wordDict){
        for(String word : wordDict){
            if(word.equals(s)){
                return true;
            }
        }
        return false;
    }
}
