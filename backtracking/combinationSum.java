package backtracking;

import java.util.ArrayList;
import java.util.List;

public class combinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> uniqueCombinations = new ArrayList<>();
        List<Integer> targetList = new ArrayList<>();
        backtrack(uniqueCombinations, targetList, candidates, target, 0);
        return uniqueCombinations;
    }

    public static void backtrack(List<List<Integer>> uniqueCombinations, List<Integer> targetList, int[] candidates, int target, int start){
        if(target < 0){
            return;
        }else if(target == 0){
            uniqueCombinations.add(new ArrayList<>(targetList));
        }else{
            for(int i = start; i < candidates.length; i++){
                targetList.add(candidates[i]);
                backtrack(uniqueCombinations, targetList, candidates, target-candidates[i], i);
                targetList.remove(targetList.size()-1);
            }
        }
    }
}
