package Day34;

public class ArrayRearrange {
   void rearrange(int[] arr,int n){
     int[] positive = new int[n];
    int[] negative = new int[n];

    // Separate positive and negative numbers
    int posIndex = 0, negIndex = 0;
    for (int num : arr) {
        if (num >= 0) {
            positive[posIndex++] = num;
        } else {
            negative[negIndex++] = num;
        }
    }

    // Merge positive and negative numbers alternatively
    int i = 0, j = 0, resultIndex = 0;
    while (i < posIndex && j < negIndex) {
        arr[resultIndex++] = positive[i++];
        arr[resultIndex++] = negative[j++];
    }

    // Add remaining positive numbers, if any
    while (i < posIndex) {
        arr[resultIndex++] = positive[i++];
    }

    // Add remaining negative numbers, if any
    while (j < negIndex) {
        arr[resultIndex++] = negative[j++];
    }
}
   }
