package Strings;

public class countSegments {
    public static void main(String[] args) {
        System.out.println(countSegments(", , , ,        a, eaefa"));
    }

    public static int countSegments(String s) {
        if(s.isEmpty()) return 0;
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' ')){
                count++;
            }
        }
        return count;
    }
}
