package Binary_Search;

public class search {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}
