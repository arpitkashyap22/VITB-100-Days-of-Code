package Day30;

public class PalindromArray {
    public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  for(int i = 0 ; i<n; i++){
                      int temp = a[i];
                      int reverse = 0;
                      int rem;
                      while(temp!=0){
                          rem = temp%10;
                          reverse = (reverse * 10) + rem;
                          temp = temp /10;
                      }
                      if(a[i]!=reverse){
                          return 0;
                      }
                  }
                  
                  return 1;
                  
           }
}
