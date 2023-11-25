package Day15_CodeVita;

import java.util.Scanner;
import java.util.Arrays;

public class BestBubble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid positive integer for the number of elements.");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter space-separated elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(findBestBubble(arr));
    }

    static int findBestBubble(int[] arr) {
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        int forAsc = bubbleAscending(arrCopy);
        int forDes = bubbleDescending(arrCopy);
        return Math.min(forAsc, forDes);
    }

    static int bubbleAscending(int[] arr) {
        boolean swapped;
        int ascCount = 0;

        // count for ascending
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                    ascCount++;
                }
            }
            if (!swapped) {
                break;
            }
        }

        return ascCount;
    }

    static int bubbleDescending(int[] arr) {
        boolean swapped;
        int desCount = 0;

        // count for descending
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                    desCount++;
                }
            }
            if (!swapped) {
                break;
            }
        }

        return desCount;
    }
}

