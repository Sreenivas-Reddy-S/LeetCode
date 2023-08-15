package Strings;

public class mySqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x) {
        long root = x;
        while(root*root>x){
            root = (root+x/root)/2;
        }
        return (int)root;
    }
}
