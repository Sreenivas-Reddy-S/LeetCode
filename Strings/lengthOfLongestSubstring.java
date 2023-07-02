package Strings;

import java.util.HashSet;

public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        int left = 0;
        int right = 0;
        HashSet<Character> eliminateDuplicates = new HashSet<>();
        while(right < s.length()){
            if(!eliminateDuplicates.contains(s.charAt(right))){
                eliminateDuplicates.add(s.charAt(right));
                right++;
                result = Math.max(result, eliminateDuplicates.size());
            }else{
                eliminateDuplicates.remove(s.charAt(left));
                left++;
            }
        }
        return result;
    }
}
