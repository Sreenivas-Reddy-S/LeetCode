package backtracking;

import java.util.ArrayList;
import java.util.List;

public class letterCombinations {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length()==0){
            return result;
        }
        String[] dict = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack(result, digits, "", dict);
        return result;
    }

    public static void backtrack(List<String> result, String digits, String current, String[] dict){
        if(current.length()==digits.length()){
            result.add(current);
            return;
        }
        String letters = dict[digits.charAt(current.length())-'0'];
        for(int i = 0; i<letters.length(); i++){
            backtrack(result, digits, current+letters.charAt(i), dict);
        }
    }
}
