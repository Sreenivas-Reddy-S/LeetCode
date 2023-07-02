package Binary_Search;

public class findBestValue {
    public static void main(String[] args) {
        int[] arr = {4, 9, 3};
        int target = 10;
        System.out.println(findBestValue(arr, target));
    }

    public static int findBestValue(int[] arr, int target){
        int start = 0;
        int end = 0;
        for (int num : arr){
            end = Math.max(end, num);
        }
        while(start < end){
            int mid = (start + end)/2;
            int sum = 0;
            for (int num : arr){
                sum += Math.min(num, mid);
            }
            if (sum < target){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int num : arr){
            sum1 += Math.min(num, start);
            sum2 += Math.min(num, start - 1);
        }
        return Math.abs(sum1 - target) < Math.abs(sum2 - target) ? start : start - 1;
    }
}
