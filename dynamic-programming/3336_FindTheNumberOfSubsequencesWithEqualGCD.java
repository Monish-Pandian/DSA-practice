/**
 * Problem: Subsequence Pair Count(#3336)
 * Difficulty: Hard
 * Pattern: Dynamic Programming, GCD
 * Time Complexity: O(n × m² × log m)
 * Space Complexity: O(m²)
 * LeetCode: https://leetcode.com/problems/find-the-number-of-subsequences-with-equal-gcd/
 */

class Solution {

    private static final int MOD = 1_000_000_007;

    public int subsequencePairCount(int[] nums) {

        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        int[][] dp = new int[max + 1][max + 1];
        dp[0][0] = 1;

        for (int num : nums) {

            int[][] next = new int[max + 1][max + 1];

            for (int g1 = 0; g1 <= max; g1++) {

                int newG1 = gcd(g1, num);

                for (int g2 = 0; g2 <= max; g2++) {

                    if (dp[g1][g2] == 0)
                        continue;

                    int ways = dp[g1][g2];

                    next[g1][g2] = (next[g1][g2] + ways) % MOD;

                    next[newG1][g2] = (next[newG1][g2] + ways) % MOD;

                    int newG2 = gcd(g2, num);
                    next[g1][newG2] = (next[g1][newG2] + ways) % MOD;
                }
            }

            dp = next;
        }

        int ans = 0;

        for (int g = 1; g <= max; g++) {
            ans = (ans + dp[g][g]) % MOD;
        }

        return ans;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}