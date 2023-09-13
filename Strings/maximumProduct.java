package Strings;

public class maximumProduct {
    public static void main(String[] args) {
        System.out.println(maximumProduct(new int[]{-4,-3,-2,-1,60}));
    }

    public static int maximumProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for(int num : nums){
            if(num > max){
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max){
                thirdMax = secondMax;
                secondMax = num;
            } else if(num > thirdMax && num < secondMax){
                thirdMax = num;
            }
        }
        return Math.max(max*secondMax*thirdMax, max*secondMax*thirdMax);
    }
}
