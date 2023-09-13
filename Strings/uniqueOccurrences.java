package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class uniqueOccurrences {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1,1,3};
        boolean result = uniqueOccurrences(nums);
        System.out.println(result);
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // check if the values are equal without using a stream
        HashSet<Integer> set = new HashSet<>(map.values());
        return map.size() == set.size();
    }
}
