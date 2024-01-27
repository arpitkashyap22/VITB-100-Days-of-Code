package Day74;

import java.util.Arrays;

public class KthElement {
     public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
           int x=m+n;
        int[] res=new int[x];
        int j=0;
        for(int i=0;i<n;i++)
        {
            res[i]=arr1[i];
            
        }
        for(int i=n;i<x;i++)
        {
            res[i]=arr2[j];
            j++;
        }
        Arrays.sort(res);
        long z=res[k-1];
        return z;
    }
}
