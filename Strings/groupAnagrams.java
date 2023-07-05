package Strings;

import java.util.*;

public class groupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"}; // [["bat"],["nat","tan"],["ate","eat","tea"]]
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs){
        if(strs == null  || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> result = new HashMap<>();
        for(String str : strs) {
            char[] readCharBYChar = str.toCharArray();
            Arrays.sort(readCharBYChar);
            String key = String.valueOf(readCharBYChar);
            if(!result.containsKey(key)) result.put(key, new ArrayList<>());
            result.get(key).add(str);
        }
        return new ArrayList<>(result.values());
    }
}
