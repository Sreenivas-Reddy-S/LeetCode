package Strings;

public class findPeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        int result = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            result = Math.max(result, nums[i]);
            if (result == nums[i]) {
                index = i;
            }
        }
        return index;
    }
}
