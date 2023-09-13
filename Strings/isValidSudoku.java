package Strings;

import java.util.HashSet;
import java.util.Set;

public class isValidSudoku {
    public static void main(String[] args) {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},
                          {'6','.','.','1','9','5','.','.','.'},
                          {'.','9','8','.','.','.','.','6','.'},
                          {'8','.','.','.','6','.','.','.','3'},
                          {'4','.','.','8','.','3','.','.','1'},
                          {'7','.','.','.','2','.','.','.','6'},
                          {'.','6','.','.','.','.','2','8','.'},
                          {'.','.','.','4','1','9','.','.','5'},
                          {'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
       // Check rows
        for(int i = 0; i<board.length; i++){
            Set<Character> set = new HashSet<>();
            for(int j = 0; j<board[0].length; j++){
                if(board[i][j] != '.'){
                    if(set.contains(board[i][j])) return false;
                    else set.add(board[i][j]);
                }
            }
        }
        // Check columns
        for(int i = 0; i<board[0].length; i++){
            Set<Character> set = new HashSet<>();
            for(int j = 0; j<board.length; j++){
                if(board[j][i] != '.'){
                    if(set.contains(board[j][i])){
                        return false;
                    }else{
                        set.add(board[j][i]);
                    }
                }
            }
        }
        // Check 3x3 boxes
        for(int i = 0; i<board.length; i+=3){
            for(int j = 0; j<board[0].length; j+=3){
                Set<Character> set = new HashSet<>();
                for(int k = i; k<i+3; k++){
                    for(int l = j; l<j+3; l++){
                        if(board[k][l] != '.'){
                            if(set.contains(board[k][l])){
                                return false;
                            }else{
                                set.add(board[k][l]);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
