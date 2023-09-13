package Strings;

public class productExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = productExceptSelf(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] productExceptSelf(int[] nums) {
       // compute using division operator
        int product = 1;
        for(int num : nums){
            product *= num;
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = product/nums[i];
        }
        return nums;
    }
}
