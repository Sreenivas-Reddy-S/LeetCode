package Strings;

public class firstPalindrome {
    public static void main(String[] args) {
        String[] s = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(s));
    }

    public static String firstPalindrome(String[] s){
        for(String word: s){
            StringBuilder result = new StringBuilder(word);
            if(result.reverse().toString().equals(word)) return word;
        }
        return "";
    }
}
