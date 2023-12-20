package Day40;

import java.util.Arrays;

public class SmallSubSetSumGreater {
     int minSubset(int[] Arr,int N) { 
        Arrays.sort(Arr);
        
        long totalSum = 0;
        
        for(int i : Arr){
            totalSum += i;
        }
        
        long currSum = 0;
        int count = 0;
        for(int i = N-1; i>=0; i--){
           currSum = currSum + Arr[i];
           count++;
           if(currSum > totalSum - currSum){
               break;
           }
        }
        return count;
    }
}
