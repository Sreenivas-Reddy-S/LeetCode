package Strings;

import java.util.HashMap;

public class decodeMessage {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        System.out.println(decodeMessage(key, message));
    }

    public static String decodeMessage(String key, String message){
        StringBuilder result = new StringBuilder();
        key = key.replaceAll(" ", "");
        System.out.println(key);
        HashMap<Character, Character> letters = new HashMap<>();
        char initial = 'a';
        for(int i = 0; i < key.length(); i++){
            if(!letters.containsKey(key.charAt(i))){
                letters.put(key.charAt(i), initial++);
            }
        }

        for(int i = 0; i < message.length(); i++){
            if(message.charAt(i) == ' '){
                result.append(" ");
            } else {
                result.append(letters.get(message.charAt(i)));
            }
        }
        return result.toString();
    }
}
