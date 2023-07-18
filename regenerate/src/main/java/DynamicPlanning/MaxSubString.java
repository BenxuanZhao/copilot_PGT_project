package DynamicPlanning;

public class MaxSubString {
    /* Here is the explanation for the code above:
1. Find the longest common subsequence of two strings.
2. Use the length of longest common subsequence to get the shortest common supersequence.
3. The length of the shortest common supersequence = (length of text1) + (length of text2) - (length of longest common subsequence) */
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        int[][] dp = new int[m+1][n+1];
        // dp[i][j] means the longest common subsequence of text1[0:i] and text2[0:j]
        // dp[i][j] = dp[i-1][j-1] + 1 if text1[i] == text2[j]
        // dp[i][j] = max(dp[i-1][j], dp[i][j-1]) if text1[i] != text2[j]
        // dp[0][j] = 0, dp[i][0] = 0
        // return dp[m][n]

        for (int i=1; i<=m; i++) {
            char c1 = text1.charAt(i-1);
            for (int j=1; j<=n; j++) {
                char c2 = text2.charAt(j-1);
                if (c1 == c2) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }

        return dp[m][n];
    }

    public int shortestCommonSupersequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        int lcs = longestCommonSubsequence(text1, text2);
        return m + n - lcs;
    }
}
