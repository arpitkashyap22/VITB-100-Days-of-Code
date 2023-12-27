package Day29;

import java.util.Arrays;

public class ModSum {
    int Maximize(int arr[], int n)
    {
        // Complete the function
        
       
        int mod = 1000000007;
     
        // Sorting the array in ascending order
        Arrays.sort(arr);
        
        long ans = 0;
        
        // Calculating the sum of product of each element with its index
        // and taking modulo to avoid overflow
        for(int i=0;i<n;i++)
            ans = (ans + ((long)arr[i]*i)%mod )%mod;
        
        return (int)ans;

    }   
}
