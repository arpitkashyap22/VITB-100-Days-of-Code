package Day33;

import java.util.HashMap;
import java.util.Map;

public class CountPairHash {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
       Map<Integer,Integer> m = new HashMap<>();
       int count =0;
       
       for(int i =0; i< n; i++){
            if (m.containsKey(k - arr[i])) {
                count += m.get(k - arr[i]);
            }
            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            }
            else {
                m.put(arr[i], 1);
            }
       }
        return count;
    }
}
