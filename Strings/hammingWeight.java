package Strings;

public class hammingWeight {
    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000001011));
    }

    public static int hammingWeight(int n) {
        int result = 0;
        String input = Integer.toBinaryString(n);
        for(int i = 0; i<input.length(); i++){
            if(input.charAt(i)=='1'){
                result++;
            }
        }
        return result;
    }
}
