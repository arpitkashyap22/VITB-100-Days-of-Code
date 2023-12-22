package Day43;

import java.util.Arrays;

public class FindMaxAbsSum {
     long maxSum(long arr[] ,int n)
    {
        Arrays.sort(arr);
        
        long newArr[] = new long[n];
        
        int i = 0;
        int st = 0;
        int en = n-1;
        while(i<n){
            if(i%2 == 0){
                newArr[i] = arr[st];
                st++;
            }else{
                newArr[i] = arr[en];
                en--;
            }
            i++;
        }
        
        long sum = 0;
        
        for(int k = 0; k<n; k++){
            if(k  == n-1 ){
                sum  = sum + Math.abs(newArr[k] - newArr[0]);
                break;
            }
            sum  = sum + Math.abs(newArr[k] - newArr[k+1]);
        }
        
        
        return sum;
    }
}
