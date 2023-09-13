package Strings;

public class sortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        int[] result = sortArrayByParity(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] sortArrayByParity(int[] nums) {
        int even = 0;
        // in place sorting
        for(int num : nums){
            if(num % 2 == 0){
                int temp = nums[even];
                nums[even] = num;
                nums[num] = temp;
                even++;
            }
        }
        return nums;
    }
}



//public static int[] sortArrayByParity(int[] nums) {
//    int[] result = new int[nums.length];
//    int even = 0;
//    int odd = nums.length - 1;
//    for(int num : nums){
//        if(num % 2 == 0){
//            result[even] = num;
//            even++;
//        }else{
//            result[odd] = num;
//            odd--;
//        }
//    }
//    return result;