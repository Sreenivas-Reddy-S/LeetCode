package Strings;

public class isAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        int len = s.length();
        int[] freqOfChar = new int[26];
        for(int i = 0; i < len; i++) freqOfChar[s.charAt(i) - 'a']++;
        for(int i = 0; i < len; i++) freqOfChar[t.charAt(i) - 'a']--;
        for(int value : freqOfChar) if (value != 0) return false;
        return true;
    }
}
