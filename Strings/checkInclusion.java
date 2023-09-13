package Strings;

import java.util.Arrays;

public class checkInclusion {
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo")); // true
        System.out.println(checkInclusion("ab", "eidboaoo")); // false
    }

    public static boolean checkInclusion(String s1, String s2) {
        int[] s1map = new int[26];
        int[] s2map = new int[26];
        // fill s1map with the frequency of each character in s1
        for(int i = 0; i < s1.length(); i++){
            s1map[s1.charAt(i)-'a']++;
        }
        // sliding window on the string s2
        for(int i = 0; i < s2.length(); i++){
            // add one more letter on the right side of the window
            s2map[s2.charAt(i)-'a']++;
            // remove one letter from the left side of the window
            if(i >= s1.length()){
                s2map[s2.charAt(i-s1.length())-'a']--;
            }
            // compare array in the sliding window
            if(Arrays.equals(s1map, s2map)){
                return true;
            }
        }
        return false;
    }
}
