package DynamicPlanning;

public class MinStairs {
    /* Here is the explanation for the code above:
1. f1, f2 are the minimum cost to climb to the top starting from index i+1, i+2 respectively.
2. The goal is to get to the top from index -1, so the final answer is Math.min(f1, f2).
3. At each step, we maintain f1 = f(i+1), f2 = f(i+2).
4. f(i) = cost[i] + Math.min(f(i+1), f(i+2)).
5. So, the code traverses backward. */
    public int minCostClimbingStairs(int[] cost) {
        int f1 = 0, f2 = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            int f0 = cost[i] + Math.min(f1, f2);
            f2 = f1;
            f1 = f0;
        }
        return Math.min(f1, f2);
    }
}
