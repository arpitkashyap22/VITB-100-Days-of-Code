package Day55;

import java.util.Stack;

public class LargestRectangle {
    // Function to find the largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) {
        int prevSmall[] = findPrevSmallElement(hist, n);
        int nextSmall[] = findNextSmallElement(hist, n);

        long maxArea = 0; // Initialize maxArea to 0

        for (int i = 0; i < n; i++) {
            // Calculate the width as (nextSmall[i] - prevSmall[i])
            long width = (nextSmall[i] == -1 ? n : nextSmall[i]) - prevSmall[i] - 1;
            long currArea = hist[i] * width;

            System.out.println("Bar " + i + ": Height = " + hist[i] + ", Width = " + width + ", Current Area = " + currArea);

            if (currArea > maxArea) {
                maxArea = currArea;
            }
        }

        return maxArea;
    }

    private static int[] findPrevSmallElement(long hist[], long n) {
        Stack<Integer> stack = new Stack<>();
        int arr[] = new int[(int) n];
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && hist[stack.peek()] > hist[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                arr[i] = -1;
            } else {
                arr[i] = stack.peek();
            }
            stack.push(i);
        }

        return arr;
    }

    private static int[] findNextSmallElement(long hist[], long n) {
        Stack<Integer> stack = new Stack<>();
        int arr[] = new int[(int) n];
        for (int i = (int) n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && hist[stack.peek()] > hist[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                arr[i] = (int) n;
            } else {
                arr[i] = stack.peek();
            }
            stack.push(i);
        }

        return arr;
    }

    public static void main(String[] args) {
        long[] hist = {6, 2, 5, 4, 5, 1, 6};
        long result = getMaxArea(hist, hist.length);
        System.out.println("Result: " + result); // Output: 12
    }
}

