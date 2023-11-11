package Day1;

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class MissingNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] array = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                array[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            System.out.println(sln.missingNumber(array, n));
        }
    }
}
// } Driver Code Ends

// User function Template for Java

class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        int[] arr = new int[n];
        // initializing zero to all elemrnts
        for (int i = 0; i < n; i++) {
            arr[i] = 0;
        }
        // marking each element present
        for (int i = 0; i < n - 1; i++) {
            arr[array[i] - 1] = 1;
        }
        // checking for answer
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                ans = i + 1;
                break;
            }
        }

        return ans;

    }
}