package Day8;

import java.util.Arrays;

public class TransposeMatrix {
    public static void transpose(int n,int a[][])
    {
        for(int i = 0; i<n ;i++){
            for(int j = 0; j<n; j++){
               if((i-j) > 0){
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
               }
            }
        }
    }
    public static void main(String[] args) {
        int arr[][] = {
            {1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}
        };
        
        transpose(4, arr);

        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));
        }
    }
}
