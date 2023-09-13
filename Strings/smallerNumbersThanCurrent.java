package Strings;

public class smallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] result = smallerNumbersThanCurrent(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] > nums[j]){
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
