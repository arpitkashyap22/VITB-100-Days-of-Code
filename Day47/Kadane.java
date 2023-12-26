package Day47;

public class Kadane {
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long maxSum = Long.MIN_VALUE;
        long sum = 0;
        for(int i = 0; i<n; i++){
            sum +=arr[i];
            maxSum = Math.max(maxSum, sum);
            if(sum<0){
                sum = 0;
            }
        }
        return maxSum;
        
    }
}
