/**
 * Problem: Stone Game III (#1406)
 * Difficulty: Hard
 * Pattern: Dynamic Programming, Game Theory
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/stone-game-iii/
 */

class Solution {
    public String stoneGameIII(int[] stoneValue) {

        int n = stoneValue.length;

        int[] dp = new int[n + 3];

        for (int i = n - 1; i >= 0; i--) {

            int sum = 0;
            int best = Integer.MIN_VALUE;

            for (int j = 0; j < 3 && i + j < n; j++) {

                sum += stoneValue[i + j];

                best = Math.max(best, sum - dp[i + j + 1]);
            }

            dp[i] = best;
        }

        if (dp[0] > 0) {
            return "Alice";
        } else if (dp[0] < 0) {
            return "Bob";
        } else {
            return "Tie";
        }
    }
}

