/**
 * Problem: Predict the Winner (#486)
 * Difficulty: Medium
 * Pattern: Dynamic Programming, Game Theory, Minimax
 * Time Complexity: O(n²)
 * Space Complexity: O(n²)
 * LeetCode: https://leetcode.com/problems/predict-the-winner/
 */
class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;

        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = nums[i];
        }

        for (int len = 2; len <= n; len++) {
            for (int left = 0; left + len - 1 < n; left++) {

                int right = left + len - 1;

                int takeLeft = nums[left] - dp[left + 1][right];
                int takeRight = nums[right] - dp[left][right - 1];

                dp[left][right] = Math.max(takeLeft, takeRight);
            }
        }

        return dp[0][n - 1] >= 0;
    }
}