package backtracking;

import java.util.ArrayList;
import java.util.List;

public class combine {
    public static void main(String[] args) {
        System.out.println(combine(4,2));
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        backtrack(result, combination, n, k, 1);
        return result;
    }

    public static void backtrack(List<List<Integer>> result, List<Integer> combination, int n, int k, int start){
        if(k == 0){
            result.add(new ArrayList<>(combination));
        }else{

            for(int i = start; i <= n; i++){
                combination.add(i);
                backtrack(result, combination, n, k-1, i+1);
                combination.remove(combination.size()-1);
            }
        }
    }
}
