package Day67;

public class FindCelebrety {
    int celebrity(int M[][], int n)
    {
     int candidate = 0;

        // Find potential celebrity using two-pointer approach
        for (int i = 1; i < n; i++) {
            if (M[candidate][i] == 1) {
                candidate = i; // i knows candidate, so i becomes a potential celebrity
            }
        }

        // Verify if the potential celebrity is indeed a celebrity
        for (int i = 0; i < n; i++) {
            if (i != candidate && (M[i][candidate] == 0 || M[candidate][i] == 1)) {
                return -1; // i doesn't know candidate or candidate knows i, so candidate is not a celebrity
            }
        }

        return candidate;
    }
}
