package Strings;

public class missingWord {
    public static void main(String[] args) {
        String s = "I am using HackerRank to improve programming";
        String t = "am HackerRank to improve";
        System.out.println(missingWord(s, t));
    }

    public static String missingWord(String s, String t){
        String[] sArr= s.split(" ");
        String[] tArr= t.split(" ");
        StringBuilder result = new StringBuilder();
        int j=0;
        for(int i=0; i<sArr.length; i++){
            if(j<tArr.length && sArr[i].equals(tArr[j])){
                j++;
            }else{
                result.append(sArr[i] + "\n");
            }
        }
        return result.toString();
    }
}
