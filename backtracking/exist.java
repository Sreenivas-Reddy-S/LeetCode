package backtracking;

public class exist {
    public static void main(String[] args) {
        char[][] board = {{'a', 'b', 'c', 'e'},
                {'s', 'f', 'c', 's'},
                {'a', 'd', 'e', 'e'}};
        System.out.println(exist(board, "abcced"));
        System.out.println(exist(board, "see"));
        System.out.println(exist(board, "abcb"));
    }

    public static boolean exist(char[][] board, String word) {
        if (board.length == 0 || board[0].length == 0) return false;
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (backtrack(board, word, visited, 0, row, col)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean backtrack(char[][] board, String word, boolean[][] visited, int index, int row, int col) {
        if (index == word.length()) return true;
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || visited[row][col] || board[row][col] != word.charAt(index)) return false;
        visited[row][col] = true;
        boolean result = backtrack(board, word, visited, index + 1, row + 1, col) ||
                backtrack(board, word, visited, index + 1, row - 1, col) ||
                backtrack(board, word, visited, index + 1, row, col + 1) ||
                backtrack(board, word, visited, index + 1, row, col - 1);
        visited[row][col] = false;
        return result;
    }

}
