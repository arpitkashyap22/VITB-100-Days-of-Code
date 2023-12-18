package Day36;

public class SubArraySum {
    public static int smallestSubWithSum(int a[], int n, int x) {
        // Your code goes here 
         int min_length = n + 1;

        int i = 0;
        int j = 0;
        int currSum = 0;

        while (j < n) {
            while (currSum <= x && j < n) {
                if (currSum <= 0 && x > 0) {
                    i = j;
                    currSum = 0;
                }
                currSum = currSum + a[j];
                j++;
            }

            while (currSum > x && i < n) {
                if (j - i < min_length) {
                    min_length = j - i;
                }
                currSum = currSum - a[i];
                i++;
            }
        }

        return (min_length == n + 1) ? 0 : min_length;
    }
}
