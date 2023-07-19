package Strings;

public class maxDepth {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }

    public static int maxDepth(String s){
        int maxDepth = 0;
        int currentDepth = 0;
        for(char c: s.toCharArray()){
            if(c == '(') currentDepth++;
            else if(c == ')') currentDepth--;
            maxDepth = Math.max(maxDepth, currentDepth);
        }
        return maxDepth;
    }
}
