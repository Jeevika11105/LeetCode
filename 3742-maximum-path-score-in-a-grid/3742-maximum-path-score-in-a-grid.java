import java.util.Arrays;

class Solution {
    public int maxPathScore(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        
        // dp[i][j][cost] = max score
        // Initialize with -1 to represent unreachable states
        int[][][] dp = new int[m][n][k + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        // Base case: starting cell (0,0)
        int startVal = grid[0][0];
        int startCost = (startVal == 0) ? 0 : 1;
        int startScore = startVal;
        
        if (startCost <= k) {
            dp[0][0][startCost] = startScore;
        } else {
            return -1; // Cannot even start
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int c = 0; c <= k; c++) {
                    if (dp[i][j][c] == -1) continue;

                    // Try moving Right (i, j+1) or Down (i+1, j)
                    int[][] directions = {{0, 1}, {1, 0}};
                    for (int[] dir : directions) {
                        int ni = i + dir[0];
                        int nj = j + dir[1];

                        if (ni < m && nj < n) {
                            int nextVal = grid[ni][nj];
                            int moveCost = (nextVal == 0) ? 0 : 1;
                            int moveScore = nextVal;

                            if (c + moveCost <= k) {
                                dp[ni][nj][c + moveCost] = Math.max(
                                    dp[ni][nj][c + moveCost], 
                                    dp[i][j][c] + moveScore
                                );
                            }
                        }
                    }
                }
            }
        }

        // Find the maximum score in the last cell for any cost <= k
        int maxScore = -1;
        for (int c = 0; c <= k; c++) {
            maxScore = Math.max(maxScore, dp[m - 1][n - 1][c]);
        }

        return maxScore;
    }
}