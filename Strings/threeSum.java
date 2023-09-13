package Strings;

import java.util.ArrayList;
import java.util.List;

public class threeSum {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> triplets = new ArrayList<>();
        // No duplicate triplets.
        for(int i = 0; i<nums.length-2; i++){
            for(int j = i+1; j<nums.length-1; j++){
                for(int k = j+1; k<nums.length; k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        triplets.add(nums[i]);
                        triplets.add(nums[j]);
                        triplets.add(nums[k]);
                        // sort the triplets
                        triplets.sort(null);
                        // check if the triplets already exists in the result
                        if(!result.contains(triplets)) {
                            result.add(triplets);
                            triplets = new ArrayList<>();
                        }
                    }
                }
            }
        }
        return result;
    }
}
