package Day37;

import java.util.Arrays;

public class ArrayMaximizeSum {
    public static long maximizeSum(long a[], int n, int k){
         Arrays.sort(a);

        int i = 0;
        while (k > 0 && i < n && a[i] < 0) {
            a[i] = -a[i];
            i++;
            k--;
        }

        // If k is still not zero, change the sign of the smallest remaining element
        if (k % 2 != 0) {
            if (i == 0 || (i < n && Math.abs(a[i - 1]) > Math.abs(a[i]))) {
                a[i] = -a[i];
            } else {
                a[i-1] = -a[i-1];
            }
        }

        long sum = 0;
        for (int j = 0; j < n; j++) {
            sum += a[j];
        }

        return sum;
    }

    public static void main(String[] args) {
        // Example usage:
        long[] arr = {-2, 0, 5, -1, 2};
        int length = arr.length;
        int k = 4;

        long result = maximizeSum(arr, length, k);
        System.out.println("Maximized sum: " + result);
    }
}
