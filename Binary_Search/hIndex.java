package Binary_Search;

public class hIndex {
    public static void main(String[] args) {
        int[] citations = {0, 1, 3, 5, 6};
        System.out.println(hIndex(citations));
    }

    public static int hIndex(int[] citations){
        for (int i = 0; i < citations.length; i++){
            if (citations[i] >= citations.length - i){
                return citations.length - i;
            }
        }
        return 0;
    }
}
