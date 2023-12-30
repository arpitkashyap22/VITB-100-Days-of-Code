package Day51;

import java.util.Arrays;

public class TripletSumArr {
     public static boolean find3Numbers(int A[], int n, int X) { 
    
       // Your code Here
       
       Arrays.sort(A);
       
       for(int a1 = 0; a1<n-2 && A[a1]<= X; a1++){
           int remSum = X - A[a1];
           int a2 = a1+1;
           int a3 = n-1;
           
           while(a3>a2){
               int currSum = A[a2] + A[a3];
               if(currSum == remSum){
                   return true;
               }else if(currSum < remSum){
                   a2++;
               }else{
                   a3--;
               }
           }
       }
       
       return false;
    
    }
}
