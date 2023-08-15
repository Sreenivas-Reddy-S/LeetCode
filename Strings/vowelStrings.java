package Strings;

public class vowelStrings {
    public static void main(String[] args) {
        String[]  words = {"are","amy","u"};
        int left = 0;
        int right = 2;
        System.out.println(vowelStrings(words, left, right));
    }

    public static int vowelStrings(String[] words, int left, int right){
        int result = 0;
        String vowels = "aeiou";
        for(int i=left; i<=right;i++){
            if(vowels.contains(String.valueOf(words[i].charAt(0))) && vowels.contains(String.valueOf(words[i].charAt(words[i].length() - 1)))) result++;
        }
        return result;
    }
}
