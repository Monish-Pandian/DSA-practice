/**
 * Problem: Jump Game VII (#1871)
 * Difficulty: Med.
 * Pattern: SlidingWindow + DP
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/jump-game-vii/
 */
public class JumpGameVII {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length(), pre = 0;
        boolean[] dp = new boolean[n];
        dp[0] = true;
        for (int i = 1; i < n; i++) {
            if (i >= minJump && dp[i - minJump]) pre++;
            if (i > maxJump && dp[i - maxJump - 1]) pre--;
            if (pre > 0 && s.charAt(i) == '0') dp[i] = true;
        }
        return dp[n - 1];
    }
}
