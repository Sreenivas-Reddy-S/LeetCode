package Strings;

public class reversePrefix {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }

    public static String reversePrefix(String word, char ch){
        int index = word.indexOf(ch);
        if(index == -1) return word;
        StringBuilder result = new StringBuilder(word.substring(0, index + 1));
        return result.reverse().append(word.substring(index + 1)).toString();
    }
}
