package backtracking;

import java.util.List;
import java.util.ArrayList;

public class permute {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(result, current, nums);
        return result;
    }

    public static void backtrack(List<List<Integer>> result, List<Integer> current, int[] nums){
        if(current.size()==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i = 0; i<nums.length; i++){
            if(current.contains(nums[i])){
                continue;
            }
            current.add(nums[i]);
            backtrack(result, current, nums);
            current.remove(current.size()-1);
        }
    }

}
