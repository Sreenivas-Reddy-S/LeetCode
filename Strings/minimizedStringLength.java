package Strings;

import java.util.HashSet;

public class minimizedStringLength {
    public static void main(String[] args) {
        String s = "aabcccd";
        System.out.println(minimizedStringLength(s));
    }

    public static int minimizedStringLength(String s){
        int[] arr = new int[26];
        int result = 0;
        for(char c: s.toCharArray()) arr[c-'a']++;
        for(int count: arr){
            if (count != 0) result++;
        }
        return result;
    }
}
