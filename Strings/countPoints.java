package Strings;

public class countPoints {
    public static void main(String[] args) {
        String rings = "B0B6G0R6R0R6G9";
        System.out.println(countPoints(rings));
    }

    public static int countPoints(String rings){
        int result = 0;
        for(int i = 0; i < rings.length(); i += 2){
            int x = rings.charAt(i) - 'A';
            int y = rings.charAt(i + 1) - '0';
            result += Math.pow(x, 2) + Math.pow(y, 2) <= 36 ? 1 : 0;
        }
        return result;
    }
}
