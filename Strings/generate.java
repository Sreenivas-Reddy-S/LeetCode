package Strings;

import java.util.ArrayList;
import java.util.List;

public class generate {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows <= 0) return result;
        List<Integer> currentRow = null;
        List<Integer> previuosRow = null;
        for (int i = 0; i < numRows; i++) {
            currentRow = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                currentRow.add((j == 0 || j == i) ? 1 : previuosRow.get(j - 1) + previuosRow.get(j));
            }
            previuosRow = currentRow;
            result.add(currentRow);
        }
        return result;
    }
}