package Array;

public class ReshapeTheMatrix {
    public static int[][] Solution(int[][] mat, int r, int c) {
        int rows = mat.length, cols = mat[0].length;
        int[][] matrix = new int[r][c];
        if(r*c != rows*cols) return mat;
        else {
            int col = 0, row = 0;
            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < cols; j++) {
                    matrix[row][col++] = mat[i][j];
                    if(col == c) {
                        col = 0;
                        row++;
                    }
                }
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4}};
        System.out.println(Solution(arr,1,4));
    }
}
