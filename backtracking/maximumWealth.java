package backtracking;

public class maximumWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] account : accounts){
            int sum = 0;
            for(int i : account){
                sum += i;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
