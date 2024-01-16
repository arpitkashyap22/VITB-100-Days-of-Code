package Day66;

import java.util.Arrays;
import java.util.HashMap;

public class CountMinSwap {
      public int minSwaps(int nums[])
    {
        int swaps = 0; // Variable to keep track of the number of swaps
        
        // Create a map to store element-index pairs
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        
        // Create a copy of the input array
        int[] sortedArray = nums.clone();
        
        // Sort the copyArray to have a sorted reference
        Arrays.sort(sortedArray);
        
        // Fill the indexMap with element-index pairs
        for (int i = 0; i < nums.length; i++) {
            indexMap.put(nums[i], i);
        }
        
        // Iterate through the input array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not in the correct sorted position
            if (nums[i] != sortedArray[i]) {
                swaps++; // Increment the swap count
                
                // Get the correct index of the current element from the indexMap
                int correctIndex = indexMap.get(sortedArray[i]);
                
                // Swap the elements to put the correct element in its place
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
                
                // Update the indexMap with the new indices after swapping
                indexMap.put(temp, correctIndex);
                indexMap.put(sortedArray[i], i);
            }
        }
        
        return swaps; // Return the total number of swaps performed
    }
}
