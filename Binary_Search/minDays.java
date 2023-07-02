package Binary_Search;

public class minDays {
    public static void main(String[] args) {
        int[] bloomDay = {1, 10, 3, 10, 2};
        int m = 3;
        int k = 2;
        System.out.println(minDays(bloomDay, m, k));
    }

    public static int minDays(int[] bloomDay, int m, int k){
        int left = -1;
        int right = 0;
        for (int day : bloomDay){
            right = Math.max(right, day);
        }
        while(left < right){
            int mid = (left + right)/2;
            int bouquets = 0;
            int flowers = 0;
            for (int day : bloomDay){
                if (day > mid){
                    flowers = 0;
                }else{
                    flowers++;
                    if (flowers == k){
                        bouquets++;
                        flowers = 0;
                    }
                }
            }
            if (bouquets < m){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}
