package Strings;

public class countAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n) {
        String result = "1";
        for(int i = 1; i<n; i++){
            result = count(result);
        }
        return result;
    }

    public static String count(String s){
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i = 1; i<=s.length(); i++){
            if(i==s.length() || s.charAt(i)!=s.charAt(i-1)){
                sb.append(count);
                sb.append(s.charAt(i-1));
                count = 1;
            }else{
                count++;
            }
        }
        return sb.toString();
    }
}
