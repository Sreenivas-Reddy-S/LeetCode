package Binary_Search;

import java.util.Arrays;

public class findMedianSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        int n = nums1.length;
        int m = nums2.length;
        double result = 0;
        int[] nums3 = new int[n + m];
        int k = nums3.length;
        System.arraycopy(nums1, 0, nums3, 0, n);
        System.arraycopy(nums2, 0, nums3, n, m);
        Arrays.sort(nums3);
        System.out.println(Arrays.toString(nums3));
        if (k % 2 == 0){
            result = (nums3[k / 2] + nums3[(k / 2) - 1]) / 2.0;
        }else{
            result = nums3[k / 2];
        }
        return result;
    }
}
