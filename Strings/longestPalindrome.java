package Strings;

public class longestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }

    public static String longestPalindrome(String s) {
        String result = "";
        int lengthOfSubstring = 0;
        for (int i = 0; i < s.length(); i++) {
            int left = i;
            int right = i;
            //Odd Length check
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > lengthOfSubstring) {
                    lengthOfSubstring = right - left + 1;
                    result = s.substring(left, right + 1);
                }
                left--;
                right++;
            }
            // Even Length check
            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > lengthOfSubstring) {
                    lengthOfSubstring = right - left + 1;
                    result = s.substring(left, right + 1);
                }
                left--;
                right++;
            }
        }
        return result;
    }
}
