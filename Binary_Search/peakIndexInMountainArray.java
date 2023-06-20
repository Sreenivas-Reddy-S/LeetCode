package Binary_Search;

public class peakIndexInMountainArray {
    public static void main(String[] args) {
        int[] A = {0, 1, 0};
        System.out.println(peakIndexInMountainArray(A));
    }

    public static int peakIndexInMountainArray(int[] A){
        int result = Integer.MIN_VALUE;
        int index = 0;
        for(int i=0; i<A.length; i++){
            result = Math.max(result, A[i]);
            if (result == A[i]){
                index = i;
            }
        }
        return index;
    }
}



//    public int peakIndexInMountainArray(int[] arr) {
//        int left = 0;
//        int right = arr.length - 1;
//
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//
//            if (arr[mid] < arr[mid + 1]) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//
//        return left;