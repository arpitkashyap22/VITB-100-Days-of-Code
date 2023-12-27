package Day28;

import java.util.Arrays;

public class IsSubset {
   String isSubset(int[] a1, int[] a2, int n, int m){
     Arrays.sort(a1);
    Arrays.sort(a2);

    int i = 0, j = 0;

    while (i < n && j < m) {
        if (a1[i] < a2[j]) {
            i++;
        } else if (a1[i] == a2[j]) {
            i++;
            j++;
        } else {
            return "No";
        }
    }

    // If all elements of a2 are processed, then a2 is a subset of a1
    return (j == m) ? "Yes" : "No";
   }
}
