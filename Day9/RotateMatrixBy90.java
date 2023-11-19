// Given a square matrix of size N x N. The task is to rotate it by 90 degrees in anti-clockwise direction without using any extra space. 

// Example 1:

// Input:
// N = 3 
// matrix[][] = {{1, 2, 3},
//               {4, 5, 6}
//               {7, 8, 9}}
// Output: 
// Rotated Matrix:
// 3 6 9
// 2 5 8
// 1 4 7

package Day9;

import java.util.Arrays;

public class RotateMatrixBy90 {
    public static void rotateby90(int matrix[][], int n) {
        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each column
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = n - 1;
            while (start < end) {
                int temp = matrix[start][i];
                matrix[start][i] = matrix[end][i];
                matrix[end][i] = temp;
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        rotateby90(matrix, 3);

        for (int[] is : matrix) {
            System.out.println(Arrays.toString(is));
        }
    }
}
