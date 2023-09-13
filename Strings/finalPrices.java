package Strings;

public class finalPrices {
    public static void main(String[] args) {
        int[] nums = {8,4,6,2,3};
        int[] result = finalPrices(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] finalPrices(int[] prices) {
        int[] result = new int[prices.length];
        search: for(int i=0 ; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                if(prices[j] <= prices[i]){
                    result[i] = prices[i] - prices[j];
                    continue search;
                }else result[i] = prices[i];
            }
            result[prices.length-1] = prices[prices.length-1];
        }
        return result;
    }
}
