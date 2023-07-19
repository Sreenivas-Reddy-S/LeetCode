package Strings;

public class reverseWords {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s){
        StringBuilder result = new StringBuilder();
        String[] words = s.split(" ");
        for(String word: words){
            StringBuilder sb = new StringBuilder(word);
            result.append(sb.reverse().toString() + " ");
        }
        return result.toString().trim();
    }
}
