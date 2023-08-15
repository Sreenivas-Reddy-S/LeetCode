package Strings;

public class canBeTypedWords {
    public static void main(String[] args) {
        String text = "hello world";
        String brokenLetters = "ad";
        System.out.println(canBeTypedWords(text, brokenLetters));
    }

    public static int canBeTypedWords(String text, String brokenLetters){
        int result = 0;
        String[] words = text.split(" ");
        for(String w: words){
            boolean flag = true;
            for(char c: brokenLetters.toCharArray()){
                if(w.contains(String.valueOf(c))){
                    flag = false;
                    break;
                }
            }
            if(flag) result++;
        }
        return result;
    }
}
