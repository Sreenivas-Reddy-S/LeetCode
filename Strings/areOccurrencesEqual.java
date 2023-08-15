package Strings;

import java.util.HashMap;

public class areOccurrencesEqual {
    public static void main(String[] args) {
        String s = "abacbc";
        System.out.println(areOccurrencesEqual(s));
    }

    public static boolean areOccurrencesEqual(String s){
        int arr[] = new int[26];
        int value=0;
        for(int i=0;i<s.length();i++){
            int ind=s.charAt(i)-'a';
            arr[ind]++;
            value=arr[ind];
        }

        for(int i=0;i<26;i++){
            if(arr[i] != 0 && arr[i] != value) return false;
        }
        return true;
    }
}
