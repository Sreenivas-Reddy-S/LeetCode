package Strings;

public class reverseOnlyLetters {
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

    public static String reverseOnlyLetters(String S) {
        int start = 0;
        int end = S.length()-1;
        char[] arr = S.toCharArray();
        while(start<end){
            if(!Character.isLetter(arr[start])){
                start++;
            }else if(!Character.isLetter(arr[end])){
                end--;
            }else{
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        return new String(arr);

    }
}
