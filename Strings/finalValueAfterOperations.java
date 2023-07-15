package Strings;

public class finalValueAfterOperations {
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations){
        int result = 0;
        for(String s: operations){
            if(s.equals("++X") || s.equals("X++")) result++;
            else result--;
        }
        return result;
    }
}
