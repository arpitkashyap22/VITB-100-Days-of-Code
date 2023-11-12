
package Day2;

import java.util.Arrays;

class WaveArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        convertToWave(arr.length, arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void convertToWave(int n, int[] a) {
        // code here
        for(int i = 0; i < n-1; i+=2){
            int temp = a[i+1];
            a[i+1] = a[i];
            a[i] = temp;
        }
    }
    
}