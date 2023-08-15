package Strings;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

public class sortPeople {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }

    public static String[] sortPeople(String[] names, int[] heights){
        TreeMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
        for(int i = 0; i < names.length; i++){
            map.put(heights[i], names[i]);
        }
        String[] result = new String[names.length];
        int i = 0;
        for(int key : map.keySet()){
            result[i++] = map.get(key);
        }
        return result;
    }
}
