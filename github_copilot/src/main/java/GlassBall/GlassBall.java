package GlassBall;

import java.util.Scanner;

public class GlassBall {
    public static void main(String[] args) {
        int N = 0;
        Scanner scanner = new Scanner(System.in);
        while (N < 1) {
            N = scanner.nextInt();
        }

        int[] dp = new int[N + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= N; ++i) {
            int min = i;
            for (int j = 1; j < i; ++j) {
                int tmp = Math.max(j, dp[i - j] + 1);
                if (tmp < min) {
                    min = tmp;
                }
            }
            dp[i] = min;
        }

        System.out.println(dp[N]);
    }
}
