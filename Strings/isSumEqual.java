package Strings;

public class isSumEqual {
    public static void main(String[] args) {
        String firstWord = "acb";
        String secondWord = "cba";
        String targetWord = "cdb";
        System.out.println(isSumEqual(firstWord, secondWord, targetWord));
    }

    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord){
        return convert(firstWord) + convert(secondWord) == convert(targetWord);
    }

    public static int convert(String s){
        int result = 0;
        for(char c: s.toCharArray()){
            result = result * 10 + (c - 'a');
        }
        return result;
    }
}
