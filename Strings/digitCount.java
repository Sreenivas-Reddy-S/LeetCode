package Strings;

public class digitCount {
    public static void main(String[] args) {
        String num = "1210";
        System.out.println(digitCount(num));
    }

    public static boolean digitCount(String num){
        int[] count = new int[10];
        for(char c: num.toCharArray()){
            count[c - '0']++;
        }
        for(int i=0; i<num.length();i++){
            if(Character.getNumericValue(num.charAt(i)) != count[i]) return false;
        }
        return true;
    }
}
