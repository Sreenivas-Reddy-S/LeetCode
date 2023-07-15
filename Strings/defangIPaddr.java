package Strings;

public class defangIPaddr {
    public static void main(String[] args) {
        String address = "255.100.50.0";
        System.out.println(defangIPaddr(address));
    }

    public static String defangIPaddr(String address){
        StringBuilder sb = new StringBuilder();
        for(char c: address.toCharArray()){
            if(c == '.') sb.append("[.]");
            else sb.append(c);
        }
        return sb.toString();
    }
}
