import java.util.ArrayList;

public class FirstNeg {
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        ArrayList<Long> list = new ArrayList<>();
        int s = 0;
        int e = K - 1;
        while (e < N) {
            boolean foundNeg = false;
            for (int i = s; i <= e; i++) {
                if (A[i] < 0) {
                    list.add(A[i]);
                    foundNeg = true;
                    break;
                } 
            }
            if(!foundNeg){
                list.add(0L);
            }
            s++;
            e++;
        }
        long[] result = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
