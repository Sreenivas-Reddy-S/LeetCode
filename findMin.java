package Binary_Search;

public class findMin {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums){
        int result = Integer.MAX_VALUE;
        for (int num : nums) {
            result = Math.min(result, num);
        }
        return result;
    }
}
