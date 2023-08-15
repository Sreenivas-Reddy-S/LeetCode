package Strings;

public class countPrefixes {
    public static void main(String[] args) {
        String[] words = {"a","b","c","ab","bc","abc"};
        String s = "abc";
        System.out.println(countPrefixes(words, s));
    }

    public static int countPrefixes(String[] words, String s){
        int result = 0;
        for(String w: words){
            if(s.startsWith(w)) result++;
        }
        return result;
    }
}
