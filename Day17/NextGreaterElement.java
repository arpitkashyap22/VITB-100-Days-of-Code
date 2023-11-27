package Day17;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);  // Initialize the result array with -1

        Stack<Integer> stack = new Stack<>();  // Use a stack to store indices of elements

        // Iterate through the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from the stack while the stack is not empty and the current element is greater
            while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }

            // If the stack is not empty, the next greater element is at the top of the stack
            if (!stack.isEmpty()) {
                result[i] = arr[stack.peek()];
            }

            // Push the current index onto the stack
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        int[] result = nextGreaterElement(arr);

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Next Greater Element: " + Arrays.toString(result));
    }
}
