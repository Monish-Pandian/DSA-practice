import java.util.*;

/**
 * Problem: Jump Game V (#1340)
 * Difficulty: Hard
 * Pattern: DP + DFS
 * Time Complexity: O(n*d)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/jump-game-v/
 */
public class JumpGameV {
    public int maxJumps(int[] arr, int d) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        int res = 0;
        for (int i = 0; i < n; i++) res = Math.max(res, dfs(arr, dp, i, d));
        return res;
    }
    private int dfs(int[] arr, int[] dp, int i, int d) {
        if (dp[i] != -1) return dp[i];
        dp[i] = 1;
        // Jump left
        for (int j = i - 1; j >= 0 && i - j <= d && arr[j] < arr[i]; j--)
            dp[i] = Math.max(dp[i], 1 + dfs(arr, dp, j, d));
        // Jump right
        for (int j = i + 1; j < arr.length && j - i <= d && arr[j] < arr[i]; j++)
            dp[i] = Math.max(dp[i], 1 + dfs(arr, dp, j, d));
        return dp[i];
    }
}
