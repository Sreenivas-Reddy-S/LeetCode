package Strings;

public class interpret {
    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(interpret(command));
    }

    public static String interpret(String command){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < command.length(); i++){
            if(command.charAt(i) == 'G') sb.append('G');
            else if(command.charAt(i) == '(' && command.charAt(i + 1) == ')') sb.append('o');
            else if(command.charAt(i) == '(' && command.charAt(i + 1) == 'a') sb.append("al");
        }
        return sb.toString();
    }
}
