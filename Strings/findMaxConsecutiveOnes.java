package Strings;

public class findMaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
            }else{
                result = Math.max(result, count);
                count = 0;
            }
        }
        return Math.max(result, count);
    }
}
