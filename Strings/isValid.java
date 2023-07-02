package Strings;

import java.util.Stack;

public class isValid {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s){
        Stack<Character> result = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '(' || c == '{' || c == '[') result.push(c);
            else {
                if (result.empty()) return false;
                if (c == ')' && result.peek() == '(') result.pop();
                else if (c == '}' && result.peek() == '{') result.pop();
                else if (c == ']' && result.peek() == '[') result.pop();
                else return false;
            }
        }
        return result.empty();
    }
}
