package Strings;

public class checkIfPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence){
        int[] freqOfChar = new int[26];
        for(char c: sentence.toCharArray()) freqOfChar[c - 'a']++;
        for(int value: freqOfChar) if(value == 0) return false;
        return true;
    }
}
