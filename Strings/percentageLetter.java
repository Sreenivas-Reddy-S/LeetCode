package Strings;

public class percentageLetter {
    public static void main(String[] args) {
        String s = "foobar";
        Character letter = 'o';
        System.out.println(percentageLetter(s, letter));
    }

    public static int percentageLetter(String s, Character letter){
        int result = 0;
        int len = s.length();
        for(char c: s.toCharArray()){
            if(c==letter) result++;
        }
        return result * 100 / len;
    }
}
