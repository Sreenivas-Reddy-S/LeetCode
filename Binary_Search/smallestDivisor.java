package Binary_Search;

public class smallestDivisor {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 9};
        int threshold = 6;
        System.out.println(smallestDivisor(nums, threshold));
    }

    public static int smallestDivisor(int[] nums, int threshold){
        int start = 1;
        int end = 0;
        for (int num : nums){
            end = Math.max(end, num);
        }
        while(start < end){
            int mid = (start + end)/2;
            int sum = 0;
            for (int num : nums){
                sum += (num + mid - 1)/mid;
            }
            if (sum > threshold){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
