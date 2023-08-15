package Strings;

public class reverseString {
    public static void main(String[] args) {
        String[] s = {"h","e","l","l","o"};
        reverseString(s);
    }

    public static void reverseString(String[] s){
        int i = 0;
        int j = s.length - 1;
        while(i < j){
            String temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        for(String word: s){
            System.out.print(word + " ");
        }
    }

}
