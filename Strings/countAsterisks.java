package Strings;

public class countAsterisks {
    public static void main(String[] args) {
        String s = "l|*e*et|c**o|*de|";
        System.out.println(countAsterisks(s));
    }

    public static int countAsterisks(String s){
        int count = 0;
        int bars = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '*' && bars%2 == 0) count++;
            if(s.charAt(i) == '|') bars++;
        }
        return count;
    }
}
