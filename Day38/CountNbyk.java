package Day38;

import java.util.HashMap;

public class CountNbyk {
     public int countOccurence(int[] arr, int n, int k) 
    {
         HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each element
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check which elements appear more than n/k times
        int count = 0;
        for (int key : map.keySet()) {
            if (map.get(key) > n / k) {
                count++;
            }
        }

        return count;
    }
}
