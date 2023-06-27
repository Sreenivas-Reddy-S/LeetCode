package Binary_Search;

public class shipWithinDays {
    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int D = 5;
        System.out.println(shipWithinDays(weights, D));
    }

    public static int shipWithinDays(int[] weights, int days){
        int maxWt = -1;
        int sumWt = 0;
        for (int wt : weights){
            maxWt = Math.max(maxWt, wt);
            sumWt += wt;
        }
        int start = maxWt;
        int end = sumWt;
        while(start < end){
            int mid = (start + end)/2;
            int daysNeeded = 1;
            int currWt = 0;
            for (int wt : weights){
                if (currWt + wt > mid){
                    daysNeeded++;
                    currWt = 0;
                }
                currWt += wt;
            }
            if (daysNeeded > days) {
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
