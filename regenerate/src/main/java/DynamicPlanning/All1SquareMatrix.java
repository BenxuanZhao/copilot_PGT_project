package DynamicPlanning;

public class All1SquareMatrix {
    /* Here is the explanation for the code above:
1. matrix[i][j] == 0, dp[i][j] = 0
2. matrix[i][j] == 1, dp[i][j] = min(dp[i-1][j], dp[i][j-1], dp[i-1][j-1]) + 1
3. the total number of squares is the sum of all elements in dp. */
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] dp = new int[m+1][n+1];
        // dp[i][j] means the length of the largest square with right bottom corner at matrix[i-1][j-1]
        // dp[i][j] = min(dp[i-1][j], dp[i][j-1], dp[i-1][j-1]) + 1 if matrix[i-1][j-1] == 1
        // dp[i][j] = 0 if matrix[i-1][j-1] == 0
        // return sum(dp[i][j])

        int sum = 0;
        for (int i=1; i<=m; i++) {
            for (int j=1; j<=n; j++) {
                int val = matrix[i-1][j-1];
                if (val == 1) {
                    dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]);
                    dp[i][j] = Math.min(dp[i][j], dp[i-1][j-1]) + 1;
                    sum += dp[i][j];
                }
            }
        }

        return sum;
    }
}
