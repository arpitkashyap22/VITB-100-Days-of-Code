package Day48;

import java.util.Arrays;

public class KSmallElement {
     public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        Arrays.sort(arr);
        
        return arr[k-1];
    } 
}
