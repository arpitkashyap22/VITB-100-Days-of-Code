package Day68CodeVita;

import java.util.Scanner;

public class Dream11Team {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if (n < 11 || n > 200) {
            System.out.println("Invalid number of players. Must be between 11 and 200.");
            return;
        }

        int[] prices = new int[n];
        int[] values = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
            if (prices[i] < 1 || prices[i] > 20) {
                System.out.println("Invalid price value. Must be between 1 and 20.");
                return;
            }
        }

        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            if (values[i] < 1 || values[i] > 20) {
                System.out.println("Invalid player value. Must be between 1 and 20.");
                return;
            }
        }

        int budget = scanner.nextInt();
        if (budget < 1 || budget > 1000) {
            System.out.println("Invalid budget. Must be between 1 and 1000.");
            return;
        }

        int result = selectPlayers(n, prices, values, budget);

        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println("Insufficient Budget");
        }
    }

    private static int selectPlayers(int n, int[] prices, int[] values, int budget) {
        if (n < 11 || n > 200) {
            return -1;
        }

        int excludedIndex = 7; // Index to be excluded
        int currentBudget = 0;
        int totalValue = 0;

        for (int i = 0; i < n; i++) {
            if (i == excludedIndex) {
                currentBudget += prices[i]; // Include the excluded player's price in the budget
                continue; // Skip the excluded player
            }

            if (i <= (n * 0.2)) { // Wicket Keeper
                if (currentBudget + prices[i] <= budget) {
                    currentBudget += prices[i];
                    totalValue += values[i];
                } else {
                    return -1; // Insufficient Budget
                }
            } else if (i % 4 == 0) { // All-Rounder
                if (currentBudget + prices[i] <= budget) {
                    currentBudget += prices[i];
                    totalValue += values[i];
                } else {
                    return -1; // Insufficient Budget
                }
            } else if (i % 2 != 0) { // Batsman
                if (currentBudget + prices[i] <= budget) {
                    currentBudget += prices[i];
                    totalValue += values[i];
                } else {
                    return -1; // Insufficient Budget
                }
            } else if (i % 4 != 0) { // Bowler
                if (currentBudget + prices[i] <= budget) {
                    currentBudget += prices[i];
                    totalValue += values[i];
                } else {
                    return -1; // Insufficient Budget
                }
            }

            if (currentBudget > budget) {
                return -1; // Insufficient Budget
            }
        }

        if (currentBudget != budget || totalValue == 0) {
            return -1; // Budget not fully utilized or no valid players selected
        }

        return totalValue;
    }
}
