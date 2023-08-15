package Strings;

public class squareIsWhite {
    public static void main(String[] args) {
        String coordinates = "a1";
        System.out.println(squareIsWhite(coordinates));
    }

    public static boolean squareIsWhite(String coordinates){
        return (coordinates.charAt(0) - 'a' + coordinates.charAt(1) - '0')% 2==0;
    }
}
