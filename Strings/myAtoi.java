package Strings;

public class myAtoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("4193 with words"));
    }

    public static int myAtoi(String s) {
        s = s.trim();
        if(s.length()==0){
            return 0;
        }
        int result = 0;
        int sign = 1;
        int i = 0;
        if(s.charAt(i)=='-' || s.charAt(i)=='+'){
            sign = s.charAt(i)=='-' ? -1 : 1;
            i++;
        }
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            if(result>Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE/10 && s.charAt(i)-'0'>7)){
                return sign==1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result*10 + (s.charAt(i)-'0');
            i++;
        }
        return result*sign;
    }
}
