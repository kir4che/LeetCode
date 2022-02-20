package Array;

import java.util.Arrays;

public class SortTheMatrixDiagonally {
    public static int[][] Solution(int[][] mat) {
        int cols = mat.length, rows = mat[0].length;
        for(int i = 0; i < cols + rows; i++) {
            int r = i, c = 0;
            if(i > rows) {
                r = 0;
                c = i - rows;
            }
            int size = Math.min(cols - c, rows - r);
            int[] arr = new int[size];
            for(int x = 0; x < size; x++) arr[x] = mat[c+x][r+x];
            Arrays.sort(arr);
            for(int x = 0; x < size; x++) mat[c+x][r+x] = arr[x];
        }
        return mat;
    }

    public static void main(String[] args) {
        int[][] arr = {{3,3,1,1},{2,2,1,2},{1,1,1,2}};
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++)
                System.out.printf("%5d ", Solution(arr)[i][j], "\n");
            System.out.println();
        }
    }
}
