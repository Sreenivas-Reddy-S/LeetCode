package Strings;

public class findWords {
    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] result = findWords(words);
        for(String s : result){
            System.out.println(s);
        }
    }

    public static String[] findWords(String[] words) {
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        String[] result = new String[words.length];
        int index = 0;
        for(String word : words){
            for(String row : rows){
                if(row.contains(String.valueOf(word.toLowerCase().charAt(0)))){
                    boolean flag = true;
                    for(int i=1; i<word.length(); i++){
                        if(!row.contains(String.valueOf(word.toLowerCase().charAt(i)))){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        result[index++] = word;
                    }
                }
            }
        }
        return result;
    }
}
