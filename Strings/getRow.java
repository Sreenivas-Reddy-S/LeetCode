package Strings;

import java.util.ArrayList;
import java.util.List;

public class getRow {
    public static void main(String[] args) {
        System.out.println(getRow(3));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        // if (rowIndex <= 0) return result[0];
        List<Integer> currentRow = null;
        List<Integer> previuosRow = null;
        for (int i = 0; i < rowIndex+1; i++) {
            currentRow = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                currentRow.add((j == 0 || j == i) ? 1 : previuosRow.get(j - 1) + previuosRow.get(j));
            }
            previuosRow = currentRow;
            result.add(currentRow);
        }
        return result.get(result.size() - 1);
    }
}
