package Binary_Search;

import java.util.HashMap;
import java.util.TreeMap;

public class TimeMap {

    private static final String DEFAULT_VALUE = "";
    private final HashMap<String, TreeMap<Integer, String>> time;

    public static void main(String[] args) {
        TimeMap obj = new TimeMap();
        obj.set("foo", "bar", 1);
        String param_2 = obj.get("foo", 1);
        String param_3 = obj.get("foo", 3);
        obj.set("foo", "bar2", 4);
        String param_4 = obj.get("foo", 4);
        String param_5 = obj.get("foo", 5);
        System.out.println(param_5);
    }

    public TimeMap() {
        time = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        TreeMap<Integer, String> timeTree;
        if (time.containsKey(key)) {
            timeTree = time.get(key);
        } else {
            timeTree = new TreeMap<>();
            time.put(key, timeTree);
        }
        timeTree.put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        if (time.containsKey(key)){
            TreeMap<Integer, String> timeTree = time.get(key);
            Integer floorKey = timeTree.floorKey(timestamp);
            if (floorKey != null){
                return timeTree.get(floorKey);
            }
        }
        return DEFAULT_VALUE;
    }
}
