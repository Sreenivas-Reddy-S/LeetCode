package Strings;

public class arrangeCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }

    public static int arrangeCoins(int n) {
        int i = 1;
        while(n>=i){
            n -= i;
            i++;
        }
        return i-1;
    }
}
