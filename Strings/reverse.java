package Strings;

public class reverse {
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }

    public static int reverse(int x){
        String result = new StringBuilder(Integer.toString(x)).reverse().toString();
        if(result.charAt(result.length()-1)=='-'){
            result = "-"+result.substring(0, result.length()-1);
        }
        try{
            return Integer.parseInt(result);
        }catch(Exception e){
            return 0;
        }
    }
}
