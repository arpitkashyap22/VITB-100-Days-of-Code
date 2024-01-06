package Day58;

public class InversionCount {
    static long inversionCount(long arr[], long N)
    {
         return mergeSortAndCount(arr, 0, N - 1);
    }
    
     static long mergeSortAndCount(long arr[], long l, long r) {
        long count = 0;

        if (l < r) {
            long mid = (l + r) / 2;

            count += mergeSortAndCount(arr, l, mid);
            count += mergeSortAndCount(arr, mid + 1, r);
            count += mergeAndCount(arr, l, mid, r);
        }

        return count;
    }

    static long mergeAndCount(long arr[], long l, long mid, long r) {
        long[] temp = new long[(int) (r - l + 1)];

        long i = l;
        long j = mid + 1;
        long k = 0;
        long count = 0;

        while (i <= mid && j <= r) {
            if (arr[(int) i] <= arr[(int) j]) {
                temp[(int) k++] = arr[(int) i++];
            } else {
                temp[(int) k++] = arr[(int) j++];
                count += mid - i + 1;
            }
        }

        while (i <= mid) {
            temp[(int) k++] = arr[(int) i++];
        }

        while (j <= r) {
            temp[(int) k++] = arr[(int) j++];
        }

        for (long p = 0; p < k; p++) {
            arr[(int) (l + p)] = temp[(int) p];
        }

        return count;
    }
}
