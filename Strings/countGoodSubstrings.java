package Strings;

public class countGoodSubstrings {
    public static void main(String[] args) {
        String s = "xyzzaz";
        System.out.println(countGoodSubstrings(s));
    }

    public static int countGoodSubstrings(String s){
        int result=0;
        for(int i=0; i<s.length()-2; i++){
            if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i+1)!=s.charAt(i+2) && s.charAt(i)!=s.charAt(i+2)) result++;
        }
        return result;
    }
}
