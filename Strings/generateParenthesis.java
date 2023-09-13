package Strings;

import java.util.List;
import java.util.ArrayList;

public class generateParenthesis {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0,n);
        return result;
    }


    public static void backtrack(List<String> result, String current, int open, int close, int max){
        if(current.length()==max*2){
            result.add(current);
            return;
        }
        if(open<max){
            backtrack(result, current+"(", open+1, close, max);
        }
        if(close<open){
            backtrack(result, current+")", open, close+1, max);
        }
    }
}
