package Strings;

public class addStrings {
    public static void main(String[] args) {
        System.out.println(addStrings("3876620623801494171", "6529364523802684779"));
    }

    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = num1.length()-1;
        int j = num2.length()-1;
        while(i>=0 || j>=0 || carry!=0){
        if(i>=0){
                carry+=num1.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                carry+=num2.charAt(j)-'0';
                j--;
            }
            sb.append(carry%10);
            carry/=10;
        }
        return sb.reverse().toString();
    }
}
