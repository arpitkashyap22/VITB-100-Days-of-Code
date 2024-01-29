import java.util.Arrays;

public class KthElement {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int[] ans = new int[k];
        int j = 0;
        for(int i = n-1; i>=n-k; i--){
            ans[j++] = arr[i];
        }
        
        return ans;
    }
}
