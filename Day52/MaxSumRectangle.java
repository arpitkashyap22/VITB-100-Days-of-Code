package Day52;

import java.util.Arrays;

public class MaxSumRectangle {
    int maximumSumRectangle(int R, int C, int M[][]) {
        int sum[] = new int[R];
        int maxSum = Integer.MIN_VALUE;
        for(int cStart = 0; cStart<C; cStart++){
            Arrays.fill(sum, 0);
            for(int cEnd = cStart; cEnd<C; cEnd++ ){
                for(int row = 0; row<R; row++){
                    sum[row] += M[row][cEnd];
                }
                int currMax = kadans(sum);
                maxSum = Math.max(maxSum, currMax);
            }
        }
        return maxSum;
    }
    
    private int kadans(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
            maxSum = Math.max(sum, maxSum);
            if(sum<0){
                sum = 0;
            }
        }
        return maxSum;
    }
}
