package GlassBall;

public class GlassBall {
    //* dp[i] = min(dp[i-j]+1, dp[j])  (0 < j < i)
    // *
    // * dp[i] means the min number of squares that can consist of sum i
    // *
    // * dp[i-j]+1 means the min number of squares that can consist of sum j plus one square with length i-j
    // *
    // * dp[j] means the min number of squares that can consist of sum j
    // *
    // * So dp[i-j]+1 means one square with length i-j and dp[j] means one square with length j
    // *
    // * So dp[i] means one square with length i and dp[j] plus one square with length i-j
    // *
    // * So we just need to find the min number of dp[i-j]+1 and dp[j] for all j < i
    // *
    // * For example, if i is 5, we just need to find the min number of dp[4]+1 and dp[3]+1
    // *
    // * So the final dp[5] will be the min number of all the min number of dp[4]+1 and dp[3]+1
    // *
    // * So dp[i] = min(dp[i-j]+1, dp[j])  (0 < j < i)
    // * */
    public static int minSquares(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0; // dp[0] means the min number of squares that can consist of sum 0
        dp[1] = 1; // dp[1] means the min number of squares that can consist of sum 1
        for (int i = 2; i <= n; ++i) {
            int min = i; // min is the min number of squares that can consist of sum i
            for (int j = 1; j < i; ++j) {
                int tmp = Math.max(j, dp[i - j] + 1); // tmp is the min number of squares that can consist of sum j plus one square with length i-j
                if (tmp < min) {
                    min = tmp;
                }
            }
            dp[i] = min;
        }
        return dp[n];
    }
}
