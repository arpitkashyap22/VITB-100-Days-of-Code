package Day68CodeVita;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChristmasTower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int[] arr1 = new int[5];
        for (int i = 0; i < 5; ++i) {
            arr1[i] = sc.nextInt();
        }

        Arrays.sort(arr1);

        int[] arr2 = new int[10001];
        Arrays.fill(arr2, -1);
        arr2[0] = 0;

        for (int b = 1; b <= a; ++b) {
            for (int c : arr1) {
                if (b - c >= 0 && arr2[b - c] != -1) {
                    arr2[b] = Math.max(arr2[b], arr2[b - c] + 1);
                }
            }
        }

        if (arr2[a] == -1) {
            System.out.println("Impossible");
            return;
        }

        Map<Integer, Integer> arr3 = new HashMap<>();
        while (a > 0) {
            for (int c : arr1) {
                if (a - c >= 0 && arr2[a] == arr2[a - c] + 1) {
                    arr3.put(c, arr3.getOrDefault(c, 0) + 1);
                    a -= c;
                    break;
                }
            }
        }

        Integer[] keys = arr3.keySet().toArray(new Integer[0]);
        Arrays.sort(keys, (key1, key2) -> {
            int valueComparison = Integer.compare(arr3.get(key2), arr3.get(key1));
            return (valueComparison == 0) ? Integer.compare(key1, key2) : valueComparison;
        });

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < keys.length; ++i) {
            result.append(keys[i]);
            if (i < keys.length - 1) {
                result.append(" ");
            }
        }

        System.out.println(result);

        sc.close();
    }
}
