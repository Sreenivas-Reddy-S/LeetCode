package Strings;

public class mostWordsFound {
    public static void main(String[] args) {
        String[] sentences = {"hello world","hello world hello world"};
        System.out.println(mostWordsFound(sentences));
    }

    public static int mostWordsFound(String[] sentences) {
        int result=0;
        for(String curr:sentences){
            int currLen=curr.split(" ").length;
            if(result<currLen) result=currLen;
        }
        return result;
    }
}
