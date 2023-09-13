package Strings;

import java.util.HashSet;
import java.util.Set;

public class distributeCandies {
    public static void main(String[] args) {
        System.out.println(distributeCandies(new int[]{1,1,2,2,3,3}));
    }

    public static int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for(int candy : candies){
            set.add(candy);
        }
        return Math.min(set.size(), candies.length/2);
    }
}
