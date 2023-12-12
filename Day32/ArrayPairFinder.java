package Day32;

public class ArrayPairFinder {

    //1st approach
    int getPairsCount1(int[] arr, int n, int k) {
        // code here
       int count =0;
       
       for(int i =0; i< n-1; i++){
           for(int j = i+1; j < n; j++){
               if((arr[i]+arr[j]) == k){
                   count++;
               }
           }
       }
        return count;
    }


}
