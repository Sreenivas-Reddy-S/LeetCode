package Strings;

public class countOfVowels {
    public static void main(String[] args) {
        String s = "leetcodeisacommunityforcoders";
        System.out.println(countOfVowels(s));
    }

    public static int countOfVowels(String s){
        int result = 0;
        for(char c: s.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') result++;
        }
        return result;
    }
}
