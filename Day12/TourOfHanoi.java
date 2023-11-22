package Day12;

import java.util.Scanner;

public class TourOfHanoi {
    public static long toh(int N, int from, int to, int aux) {
        if (N == 1) {
            System.out.println("Move disk 1 from rod " + from + " to rod " + to);
            return 1;
        }

        long count = 0;
        count += toh(N - 1, from, aux, to);
        System.out.println("Move disk " + N + " from rod " + from + " to rod " + to);
        count++;
        count += toh(N - 1, aux, to, from);

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No of Disk : ");
        int n = sc.nextInt();
        System.out.println(toh(n, 1, 2, 3));
        

    }
}
