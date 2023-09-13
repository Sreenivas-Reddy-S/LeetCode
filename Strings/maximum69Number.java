package Strings;

public class maximum69Number {
    public static void main(String[] args) {
        System.out.println(maximum69Number(9669));
    }

    public static int maximum69Number (int num) {
        String s = Integer.toString(num);
        char[] c = s.toCharArray();
        for(int i = 0; i<c.length; i++){
            if(c[i]=='6'){
                c[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(c));
    }
}
