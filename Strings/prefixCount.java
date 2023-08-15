package Strings;

public class prefixCount {
    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";
        System.out.println(prefixCount(words, pref));
    }

    public static int prefixCount(String[] words, String pref){
        int result = 0;
        for(String word: words){
            if(word.startsWith(pref)) result++;
        }
        return result;
    }
}


//    public int prefixCount(String[] words, String pref) {
//        int result=0;
//        for(String word:words){
//            if(word.indexOf(pref)==0) result++;
//        }
//        return result;
//    }