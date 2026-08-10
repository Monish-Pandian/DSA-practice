/**
 * Problem: Stone Game IV (#1510)
 * Difficulty: Hard
 * Pattern: Dynamic Programming, Game Theory
 * Time Complexity: O(n√n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/stone-game-iv/
 */


class Solution {
    public boolean winnerSquareGame(int n) {
        boolean[] dp = new boolean[n + 1];


        for (int i = 1; i <= n; i++) {

            for (int j = 1; j * j <= i; j++) {

               
                if (!dp[i - j * j]) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }
}

