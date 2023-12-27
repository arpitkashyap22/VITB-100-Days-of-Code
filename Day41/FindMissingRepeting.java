package Day41;

public class FindMissingRepeting {
    int[] findTwoElement(int arr[], int n) {
        int[] result = new int[2];
       
       // Find repeating number (B)
       for (int i = 0; i < n; i++) {
           int index = Math.abs(arr[i]) - 1;
           if (arr[index] < 0) {
               result[0] = Math.abs(arr[i]);
           } else {
               arr[index] = -arr[index];
           }
       }
       
       // Find missing number (A)
       for (int i = 0; i < n; i++) {
           if (arr[i] > 0) {
               result[1] = i + 1;
               break;
           }
       }
       
       return result;
   } 
   
//    int[] findTwoElement(int arr[], int n) {
//     int[] result = new int[2];
   
//    // Find repeating number (B)
//    for (int i = 0; i < n; i++) {
//        int index = Math.abs(arr[i]) - 1;
//        if (arr[index] < 0) {
//            result[0] = Math.abs(arr[i]);
//        } else {
//            arr[index] = -arr[index];
//        }
//    }
   
//    // Find missing number (A)
//    for (int i = 0; i < n; i++) {
//        if (arr[i] > 0) {
//            result[1] = i + 1;
//            break;
//        }
//    }
   
//    return result;
// }
}
