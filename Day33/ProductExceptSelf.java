package Day33;
public class ProductExceptSelf {
    public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long ans[] = new long[n];
        
         for(int i = 0; i<n; i++){
            ans[i] = 1;
        }
        
        int i = 0;
        int j = 1;
        
        while(i<n && j<n){
            if(j == i){
                j++;
                continue;
            }
            ans[i] = ans[i]*nums[j];
            j++;
            if(j==n){
                i++;
                j =0;
            }
        }
        
        return ans;
	} 
}
