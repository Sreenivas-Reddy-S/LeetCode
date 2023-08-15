package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class kthDistinct {
    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"};
        int k = 2;
        System.out.println(kthDistinct(arr, k));
    }

    public static String kthDistinct(String[] arr, int k){
        Map<String, Integer> map = new HashMap<>();
        for(String s: arr){
            if(map.containsKey(s)) map.put(s, map.get(s)+1);
            else map.put(s, 1);
        }
        int count = 0;
        for(String s: arr){
            if(map.get(s) == 1 && ++count == k) return s;
        }
        return "";
    }
}
