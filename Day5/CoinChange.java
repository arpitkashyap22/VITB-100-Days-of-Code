// Given an integer array coins[ ] of size N representing different denominations of currency and an integer sum, find the number of ways you can make sum by using different combinations from coins[ ].  
// Note: Assume that you have an infinite supply of each type of coin. And you can use any coin as many times as you want.

// Example 1:

// Input:
// N = 3, sum = 4
// coins = {1,2,3}
// Output: 4
// Explanation: Four Possible ways are: {1,1,1,1},{1,1,2},{2,2},{1,3}.

package Day5;

public class CoinChange {
    public static void main(String[] args) {
        int N = 3;
        int sum = 4;
        int[] coins = {1,2,3};
        System.out.println(count(coins, N, sum));
    }

    public static long count(int coins[], int N, int sum) {
        return countWays(coins, N, sum, 0);
    }

    private static long countWays(int coins[], int N, int remainingSum, int currentIndex) {
        if (remainingSum == 0) {
            return 1;
        }

        if (remainingSum < 0 || currentIndex == N) {
            return 0;
        }

        long ways = 0;

        // Try including the current coin
        ways += countWays(coins, N, remainingSum - coins[currentIndex], currentIndex);

        // Move to the next coin
        ways += countWays(coins, N, remainingSum, currentIndex + 1);

        return ways;
    }
}
