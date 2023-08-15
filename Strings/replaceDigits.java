package Strings;

public class replaceDigits {
    public static void main(String[] args) {
        String s = "a1c1e1";
        System.out.println(replaceDigits(s));
    }

    public static String replaceDigits(String s){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0) result.append(s.charAt(i));
            else result.append((char)(s.charAt(i - 1) + (s.charAt(i) - '0')));
        }
        return result.toString();
    }
}

