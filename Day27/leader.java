package Day27;

import java.util.ArrayList;

public class leader {
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
         ArrayList<Integer> result = new ArrayList<>();
        
        if (n == 0) {
            return result; // Empty array, no leaders
        }

        int maxFromRight = arr[n - 1];
        result.add(maxFromRight);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                result.add(maxFromRight);
            }
        }
        reverseArrayList(result);

        return result;
    }
    
    static void reverseArrayList(ArrayList<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }
}
