package Strings;

import java.util.HashMap;

public class destCity {
    public static void main(String[] args) {
        String[][] paths = {{"London","New York"},{"New York","Lima"},{"Lima","Sao Paulo"}};
        System.out.println(destCity(paths));
    }

    public static String destCity(String[][] paths){
        String result="";
        //construct the path map - city as key, destination as value
        HashMap<String, String> map = new HashMap<>();
        for(String[] path: paths){
            map.put(path[0], path[1]);
        }
        //iterate through the map to find the destination
        for(String city: map.keySet()){
            if(!map.containsKey(map.get(city))){
                result = map.get(city);
            }
        }
        return result;
    }
}
