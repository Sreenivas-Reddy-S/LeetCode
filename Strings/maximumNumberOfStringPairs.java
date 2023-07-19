package Strings;

public class maximumNumberOfStringPairs {
    public static void main(String[] args) {
        String[] words = {"cd","ac","dc","ca","zz"};
        System.out.println(maximumNumberOfStringPairs(words));
    }

    public static int maximumNumberOfStringPairs(String[] words) {
        int result=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<words.length;i++){
            for(int j=i+1; j<words.length;j++){
                sb.append(words[j]);
                if(words[i].equals(sb.reverse().toString())){
                    result++;
                }
                sb.delete(0,sb.length());
            }
        }
        return result;
    }
}
