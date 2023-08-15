package Strings;

public class minTimeToType {
    public static void main(String[] args) {
        String word = "abc";
        System.out.println(minTimeToType(word));
    }

    public static int minTimeToType(String word){
        int result = 0;
        char prev = 'a';
        for(char c: word.toCharArray()){
            int diff = Math.abs(c - prev);
            result += Math.min(diff, 26 - diff) + 1;
            prev = c;
        }
        return result;
    }
}
