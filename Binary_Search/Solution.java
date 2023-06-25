package Binary_Search;

import java.util.ArrayList;
import java.util.Random;
public class Solution {

    private ArrayList<Integer> probWts;
    private Random rand;

    public static void main(String[] args) {
        int[] w = {1, 3};
        Solution obj = new Solution(w);
        int param_1 = obj.pickIndex();
    }

    public Solution(int[] w) {
        this.probWts = new ArrayList();
        this.rand = new Random();
        for (int i = 0; i < w.length; i++){
            for(int j = 0; j < w[i]; j++){
                this.probWts.add(i);
            }
        }
    }

    public int pickIndex() {
        int index = rand.nextInt(this.probWts.size());
        return this.probWts.get(index);
    }
}
