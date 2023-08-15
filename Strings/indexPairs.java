package Strings;

import java.util.Arrays;

public class indexPairs {
    public static void main(String[] args) {
        String text = "thestoryofleetcodeandme";
        String[] words = {"story","fleet","leetcode"};
        System.out.println(Arrays.deepToString(indexPairs(text, words)));
    }

    public static int[][] indexPairs(String text, String[] words) {
        int[][] result = new int[words.length][2];
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int index = text.indexOf(word);
            if (index != -1) {
                result[i][0] = index;
                result[i][1] = index + word.length() - 1;
            }
        }
        return result;
    }
}
