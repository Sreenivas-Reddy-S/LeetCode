package Strings;

public class isPowerOfFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
    }

    public static boolean isPowerOfFour(int num) {
        if(num==0){
            return false;
        }
        while(num%4==0){
            num/=4;
        }
        return num==1;
    }
}
