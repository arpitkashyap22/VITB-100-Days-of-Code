package Day65;

import java.util.Stack;

public class MaxProductSubarray {
    static long maxProduct(int[] arr, int n) {
        long maxProductLeft = Integer.MIN_VALUE;
        long maxProductRight = Integer.MIN_VALUE;
        long curProductLeft = 1;
        long curProductRight = 1;
        
        
        for(int i = 0, j = n-1 ; i < n; i++,j--){
            curProductLeft *= arr[i];
            curProductRight *= arr[j];
            
            maxProductLeft = Math.max(curProductLeft, maxProductLeft);
            maxProductRight = Math.max(curProductRight, maxProductRight);
            
            if(curProductLeft == 0) curProductLeft = 1;
            if(curProductRight == 0) curProductRight = 1;
        }
        
        return Math.max(maxProductLeft, maxProductRight);
    }
    public static void main(String[] args) {
        int[] arr = {-8,5,3,1,6};
        System.out.println(maxProduct(arr, arr.length));
    }
}
