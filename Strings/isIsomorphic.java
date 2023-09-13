package Strings;

import java.util.Arrays;

public class isIsomorphic {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
    }

    public static boolean isIsomorphic(String s, String t) {
        int[] sMap = new int[256];
        int[] tMap = new int[256];
        Arrays.fill(sMap, -1);
        Arrays.fill(tMap, -1);
        for(int i = 0; i<s.length(); i++){
            if(sMap[s.charAt(i)]!=tMap[t.charAt(i)]){
                return false;
            }
            sMap[s.charAt(i)] = i;
            tMap[t.charAt(i)] = i;
        }
        return true;
    }
}
