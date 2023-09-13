package backtracking;

public class solve {
    public static void main(String[] args) {
        char[][] board = {{'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'}};
        solve(board);
        for(char[] row: board){
            for(char c: row){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }

    public static void solve(char[][] board) {
        if(board.length==0 || board[0].length==0) return;
        int row = board.length;
        int col = board[0].length;
        for(int i = 0; i<row; i++){
            for (int j = 0; j<col; j++) {
                if (i == 0 || i == row - 1 || j == 0 || j == col - 1) {
                    if (board[i][j] == 'O') backtrack(board, i, j);
                }
            }
        }

        for(int i = 0; i<row; i++){
            for (int j = 0; j<col; j++) {
                if(board[i][j]=='O') board[i][j]='X';
                else if(board[i][j]=='#') board[i][j]='O';
            }
        }
    }

    public static void backtrack(char[][] board, int row, int col){
        if(row<0 || row>=board.length || col<0 || col>=board[0].length || board[row][col]!='O') return;
        board[row][col]='#';
        backtrack(board, row+1, col);
        backtrack(board, row-1, col);
        backtrack(board, row, col+1);
        backtrack(board, row, col-1);
    }
}
