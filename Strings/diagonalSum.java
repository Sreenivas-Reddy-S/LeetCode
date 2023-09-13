package Strings;

public class diagonalSum {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        int result = 0;
        for(int i = 0; i<mat.length; i++){
            result += mat[i][i];
            if(i != mat.length-1-i){
                result += mat[i][mat.length-1-i];
            }
        }
        return result;
    }
}
