package Day48;

import java.util.Arrays;

public class TowerMinDifference {
    public static int getMinDiff(int[] arr, int n, int k) {
        // code here
        if (n == 1) return 0;

        Arrays.sort(arr);

        int ans = arr[n - 1] - arr[0];

        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;
        int mi, ma;

        for (int i = 0; i < n - 1; i++) {
            mi = Math.min(smallest, arr[i + 1] - k);
            ma = Math.max(largest, arr[i] + k);
            if (mi < 0) continue;
            ans = Math.min(ans, ma - mi);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1 ,8 ,10, 6 ,4 ,6 ,9 ,1};
        System.out.println(getMinDiff(arr, arr.length, 7));
    }
}
