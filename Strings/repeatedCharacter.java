package Strings;

import java.util.HashSet;

public class repeatedCharacter {
    public static void main(String[] args) {
        String s = "aabbccdd";
        System.out.println(repeatedCharacter(s));
    }

    public static char repeatedCharacter(String s){
        HashSet<Character> set = new HashSet<>();
        for(char c: s.toCharArray()){
            if(set.contains(c)) return c;
            set.add(c);
        }
        return ' ';
    }
}
