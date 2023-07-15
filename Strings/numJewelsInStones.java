package Strings;

public class numJewelsInStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones){
        int result = 0;
        for(char c: stones.toCharArray()){
            System.out.println("    index of " + c + " is: ");
            System.out.println(jewels.indexOf(c));
            if(jewels.indexOf(c) != -1) result++;
        }
        return result;
    }
}
