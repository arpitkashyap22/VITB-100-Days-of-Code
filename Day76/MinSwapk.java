package Day76;

public class MinSwapk {
    public static int minSwap (int arr[], int n, int k) {
        // Count elements less than or equal to K
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= k) {
                count++;
            }
        }

        // Count elements in the first window of size count
        int maxCount = 0;
        for (int i = 0; i < count; i++) {
            if (arr[i] <= k) {
                maxCount++;
            }
        }

        // Slide the window to find the maximum count
        int currentCount = maxCount;
        for (int i = count; i < n; i++) {
            if (arr[i - count] <= k) {
                currentCount--; // Decrease count for the element going out of the window
            }
            if (arr[i] <= k) {
                currentCount++; // Increase count for the new element in the window
            }
            maxCount = Math.max(maxCount, currentCount);
        }

        // Minimum swaps required = count - maximum count
        return count - maxCount;
    }
}
