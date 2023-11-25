package Day15_CodeVita;


import java.util.*;

public class PerfectBudget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] projects = new int[n][3];
        for (int i = 0; i < n; i++) {
            projects[i][0] = sc.nextInt();
            projects[i][1] = sc.nextInt();
            String rp = sc.next();
            if (rp.charAt(0) == '+') {
                projects[i][2] = sc.nextInt();
            } else {
                projects[i][2] = -sc.nextInt();
            }
        }
        Arrays.sort(projects, Comparator.comparingInt(a -> a[0]));
        int budget = 0;
        int minBudget = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            budget += projects[i][0];
            if (projects[i][1] - projects[i][2] >= 0) {
                minBudget = Math.min(minBudget, budget);
            }
        }
        System.out.println(minBudget);
    }
}
