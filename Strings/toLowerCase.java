package Strings;

public class toLowerCase {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(toLowerCase(s));
    }

    public static String toLowerCase(String s){
        StringBuilder result = new StringBuilder();
        for(char c: s.toCharArray()){
            if(c >= 'A' && c <= 'Z') result.append((char)(c + 32));
            else result.append(c);
        }
        return result.toString();
    }
}
