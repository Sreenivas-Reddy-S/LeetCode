package Binary_Search;

import java.util.Arrays;

public class searchRange {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10}; // {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    public static int[] searchRange(int[] nums, int target){
        int[] result = new int[2];
        result[0] = findFirst(nums,target);
        result[1] = findLast(nums, target);
        return result;
    }

    public static int findFirst(int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if (nums[mid] >= target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
            if (nums[mid] == target){
                index = mid;
            }
        }
        return index;
    }

    public static int findLast(int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if (nums[mid] <= target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            if (nums[mid] == target){
                index = mid;
            }
        }
        return index;
    }
}
