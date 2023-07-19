package Strings;

public class countConsistentStrings {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        System.out.println(countConsistentStrings(allowed, words));
    }

    public static int countConsistentStrings(String allowed, String[] words){
        int result = 0;
        for(String word: words) {
            boolean isConsistent = true;
            for(char c: word.toCharArray()) {
                if(!allowed.contains(String.valueOf(c))) {
                    isConsistent = false;
                    break;
                }
            }
            if(isConsistent) result++;
        }
        return result;
    }
}
