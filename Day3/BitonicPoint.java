package Day3;

public class BitonicPoint {
    public static void main(String[] args) {
        int[] arr = {1,15,25,42,21,17,12,11};
        int ans = findBitonic(arr, arr.length);
        System.out.println(ans);
    }

    public static int findBitonic(int[] arr, int n){
            int st = 0;
            int en = n-1;
        
            while(st <= en) {
                int mid = st + (en-st)/2;
        
                if((mid == 0 || arr[mid] > arr[mid-1]) && (mid == n-1 || arr[mid] > arr[mid+1])) {
                    return arr[mid];
                } else if(mid > 0 && arr[mid] < arr[mid-1]) {
                    en = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
        
            return -1;
        
    }
}
