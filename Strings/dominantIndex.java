package Strings;

public class dominantIndex {
    public static void main(String[] args) {
        int[] nums = {3,6,1,0};
        System.out.println(dominantIndex(nums));
    }

    public static int dominantIndex(int[] nums) {
        int maximum = Integer.MIN_VALUE;
        int index = 0;
        for(int num: nums){
            maximum = Math.max(num, maximum);
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] == maximum) index = i;
            int twice = nums[i] * 2;
            if(twice > maximum && nums[i] != maximum) return -1;
        }
        return index;
    }
}
