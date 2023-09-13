package Strings;

import java.util.HashMap;
import java.util.Map;

public class numIdenticalPairs {
    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[]{1,2,3,1,1,3})); // 4
    }

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int key : map.keySet()){
            int val = map.get(key);
            count += val*(val-1)/2;
        }
        return count;
    }
}
