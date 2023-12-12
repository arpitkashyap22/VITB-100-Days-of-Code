package Day32;

public class LongstCommonPrefix {
    String longestCommonPrefix(String arr[], int n){
        // code here
       int lastIndex = arr[0].length();

        for (int i = 1; i < n; i++) {
            String current = arr[i];
            String previous = arr[i - 1];

            int j = 0;
            while (j < current.length() && j < previous.length() && j < lastIndex) {
                if (current.charAt(j) == previous.charAt(j)) {
                    j++;
                } else {
                    break;
                }
            }

            if (j == 0) {
                return "-1";
            }

            if (j < lastIndex) {
                lastIndex = j;
            }
        }

        return arr[0].substring(0, lastIndex);
    }
}
