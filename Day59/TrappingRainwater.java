package Day59;

public class TrappingRainwater {
    static long trappingWater(int arr[], int n) { 
        if(n<3){
            return 0;
        }
        
        int[] left = new int[n];
        int[] right = new int[n];
        
        left[0] = arr[0];
        right[n-1] = arr[n-1];
        
        // left array
        for(int i = 1; i<n; i++){
            left[i] = Math.max(left[i-1], arr[i]);
        }
        
        //right array
        for(int i = n-2; i>=0; i--){
            right[i] = Math.max(right[i+1], arr[i]);
        }
        
        long water = 0;
        for(int i = 0; i<n; i++){
            water = water + (Math.min(left[i], right[i]) - arr[i]);
        }
        
        return water;
    } 

    public static void main(String[] args) {
        int[] arr = {8, 8, 2, 4, 5, 5, 1};
        System.out.println(trappingWater(arr, arr.length));
    }
}
