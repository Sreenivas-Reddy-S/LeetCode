package Strings;

public class truncateSentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println(truncateSentence(s, k));
    }

    public static String truncateSentence(String s, int k){
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < k; i++){
            result.append(words[i]);
            if(i != k - 1) result.append(" ");
        }
        return result.toString();
    }
}
