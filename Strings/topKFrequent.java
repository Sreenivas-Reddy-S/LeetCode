package Strings;

import java.util.HashMap;
import java.util.Map;

public class topKFrequent {
    public static void main(String[] args) {
        int [] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] result = topKFrequent(nums, k);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int i = 0; i<k; i++){
            int max = 0;
            int maxKey = 0;
            for(int key : map.keySet()){
                if(map.get(key)>max){
                    max = map.get(key);
                    maxKey = key;
                }
            }
            result[i] = maxKey;
            map.remove(maxKey);
        }
        return result;
    }
}
