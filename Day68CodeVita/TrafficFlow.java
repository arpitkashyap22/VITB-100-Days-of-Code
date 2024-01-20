package Day68CodeVita;
import java.util.Scanner;

public class TrafficFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] trafficGrid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                trafficGrid[i][j] = sc.nextInt();
            }
        }

        int startRow = sc.nextInt() - 1;
        int startCol = sc.nextInt() - 1;

        int endRow = sc.nextInt() - 1;
        int endCol = sc.nextInt() - 1;

        // for calculating minimum traffic flow
        int minTrafficFlow = minTrafficFlow(trafficGrid, startRow, startCol, endRow, endCol);

        //  for Output
        System.out.println(minTrafficFlow);

        sc.close();
    }

    static int minTrafficFlow(int[][] grid, int startRow, int startCol, int endRow, int endCol) {
        int[][] dp = new int[grid.length][grid[0].length];


        dp[startRow][startCol] = grid[startRow][startCol];
        for (int i = startRow + 1; i < grid.length; i++) {
            dp[i][startCol] = dp[i - 1][startCol] + grid[i][startCol];
        }
        for (int j = startCol + 1; j < grid[0].length; j++) {
            dp[startRow][j] = dp[startRow][j - 1] + grid[startRow][j];
        }

        for (int i = startRow + 1; i <= endRow; i++) {
            for (int j = startCol + 1; j <= endCol; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }

        if (dp[endRow][endCol] == 0) {
            return -1;
        }

        return dp[endRow][endCol];
    }
}
