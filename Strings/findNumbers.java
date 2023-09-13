package Strings;

public class findNumbers {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int result = findNumbers(nums);
        System.out.println(result);
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(String.valueOf(num).length() % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
