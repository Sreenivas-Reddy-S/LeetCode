package Strings;

public class makeSmallestPalindrome {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(makeSmallestPalindrome(s));
    }

    public static String makeSmallestPalindrome(String s){
        int n = s.length();
        int i = 0;
        int j = n - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)) break;
            i++;
            j--;
        }
        if(i >= j) return s;
        String suffix = s.substring(i, j + 1);
        String prefix = new StringBuilder(suffix).reverse().toString();
        String mid = makeSmallestPalindrome(s.substring(0, i));
        String result = s.substring(0, i) + mid + s.substring(i);
        return result;
    }
}
