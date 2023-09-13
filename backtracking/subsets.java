package backtracking;

import java.util.ArrayList;
import java.util.List;

public class subsets {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> powerSet = new ArrayList<>();
        List<Integer> subsets = new ArrayList<>();
        backtrack(powerSet, subsets, nums, 0);
        return powerSet;
    }

    public static void backtrack(List<List<Integer>> powerSet, List<Integer> subsets, int[] nums, int start){
        powerSet.add(new ArrayList<>(subsets));
        for(int i = start; i<nums.length; i++){
            subsets.add(nums[i]);
            backtrack(powerSet, subsets, nums, i+1);
            subsets.remove(subsets.size()-1);
        }
    }
}
