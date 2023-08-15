package Strings;

public class numOfStrings {
    public static void main(String[] args) {
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";
        System.out.println(numOfStrings(patterns, word));
    }

    public static int numOfStrings(String[] patterns, String word){
        int result = 0;
        for(String pattern: patterns){
            if(word.contains(pattern)) result++;
        }
        return result;
    }
}
