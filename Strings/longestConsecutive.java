package Strings;

import java.util.Arrays;


public class longestConsecutive {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int max = 1;
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]+1){
                count++;
            }else if(nums[i] == nums[i-1]){
                continue;
            }else{
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
