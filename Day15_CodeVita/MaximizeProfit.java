package Day15_CodeVita;

import java.util.Scanner;

import java.util.Scanner;

public class MaximizeProfit {
    public static int maximizeProfit(int N, int M, int[] quantity_available, int[] quantity_needed,
                                     int[] cost_of_one_unit, int[] selling_price) {
        return backtrack(0, N, M, quantity_available, quantity_needed, cost_of_one_unit, selling_price);
    }

    private static int backtrack(int currentMaterial, int remainingBudget, int M, int[] quantity_available,
                                 int[] quantity_needed, int[] cost_of_one_unit, int[] selling_price) {
        // Base case: All materials are processed
        if (currentMaterial == M) {
            return 0;
        }

        int maxProfit = 0;

        // Try different quantities of the current material
        for (int quantity = 0; quantity <= Math.min(quantity_available[currentMaterial] / quantity_needed[currentMaterial], remainingBudget / cost_of_one_unit[currentMaterial]); quantity++) {
            int currentProfit = quantity * selling_price[currentMaterial] +
                    backtrack(currentMaterial + 1, remainingBudget - quantity * cost_of_one_unit[currentMaterial],
                            M, quantity_available, quantity_needed, cost_of_one_unit, selling_price);

            maxProfit = Math.max(maxProfit, currentProfit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] quantity_available = new int[M];
        int[] quantity_needed = new int[M];
        int[] cost_of_one_unit = new int[M];
        int[] selling_price = new int[M];

        for (int i = 0; i < M; i++) {
            quantity_available[i] = scanner.nextInt();
        }

        for (int i = 0; i < M; i++) {
            quantity_needed[i] = scanner.nextInt();
        }

        for (int i = 0; i < M; i++) {
            cost_of_one_unit[i] = scanner.nextInt();
        }

        for (int i = 0; i < M; i++) {
            selling_price[i] = scanner.nextInt();
        }

        // Calculate and print the maximum profit
        int result = maximizeProfit(N, M, quantity_available, quantity_needed, cost_of_one_unit, selling_price);
        System.out.println("Maximum Profit: " + result);
    }
}
