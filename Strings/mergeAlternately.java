package Strings;

public class mergeAlternately {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2){
        StringBuilder result = new StringBuilder();
        int n = word1.length();
        int m = word2.length();
        for(int i = 0; i < n || i < m; i++){
            if(i < n) result.append(word1.charAt(i));
            if(i < m) result.append(word2.charAt(i));
        }
        return result.toString();
    }
}
