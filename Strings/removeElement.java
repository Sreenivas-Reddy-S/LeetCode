package Strings;

public class removeElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println(removeElement(nums, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for(int j = 0; j<nums.length; j++){
            if(nums[j]!=val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
