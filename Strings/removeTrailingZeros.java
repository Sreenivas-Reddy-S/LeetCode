package Strings;

public class removeTrailingZeros {
    public static void main(String[] args) {
        String num = "51230100";
        System.out.println(removeTrailingZeros(num));
    }

    public static String removeTrailingZeros(String num){
//        StringBuilder result = new StringBuilder(num);
        for(int i = num.length() - 1; i >= 0; i--){
            if(num.charAt(i) == '0') num = num.substring(0, i);
            else break;
        }
        return num;
    }
}
