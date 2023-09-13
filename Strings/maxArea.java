package Strings;

public class maxArea {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7})); // 49
    }

    public static int maxArea(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length-1;
        for(int i = 0; i<height.length; i++){
            result = Math.max(result, Math.min(height[left], height[right])*(right-left));
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return result;
    }
}
