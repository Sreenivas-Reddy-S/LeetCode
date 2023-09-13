package Strings;

import java.util.ArrayList;
import java.util.List;

public class calPoints {
    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"5","2","C","D","+"}));
    }

    public static int calPoints(String[] operations) {
        int totalPoints = 0;
        List<Integer> points = new ArrayList<>();
        for(String operation : operations){
            if(operation.equals("C")){
                totalPoints -= points.get(points.size()-1);
                points.remove(points.size()-1);
            }else if(operation.equals("D")){
                points.add(points.get(points.size()-1)*2);
            }else if(operation.equals("+")){
                points.add(points.get(points.size()-1)+points.get(points.size()-2));
            }else{
                points.add(Integer.parseInt(operation));
            }
        }
        return totalPoints;
    }
}
