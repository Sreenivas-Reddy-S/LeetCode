package backtracking;

public class flipAndInvertImage {
    public static void main(String[] args) {
        int[][] A = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] result = flipAndInvertImage(A);
        for(int i = 0; i<result.length; i++){
            for(int j = 0; j<result[0].length; j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] flipAndInvertImage(int[][] A) {
        int[][] result = new int[A.length][A[0].length];
        for(int i = 0; i<A.length; i++){
            for(int j = 0; j<A[0].length; j++){
                result[i][j] = A[i][A[0].length-1-j];
                if(result[i][j]==0){
                    result[i][j] = 1;
                }else{
                    result[i][j] = 0;
                }
            }
        }
        return result;
    }
}
