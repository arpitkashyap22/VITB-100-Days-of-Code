package Day21;

import java.util.Arrays;
import java.util.Scanner;

public class SummedMatrix {
    static long sumMatrix(long n, long q) {
        
        if(q == n+1){
            return n;
        }
        if(q > n + 1 && q <= n * 2){
            return (2*n)-q+1;
        }
        if(q >= 2 && q < n+1){
            return (q-1);
        } 
        
       return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = i+1+j+1;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+ "\t");
            }
            System.out.println("");
        }

        System.out.println(sumMatrix(n, 3));
    }
}
