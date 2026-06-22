/**
 * Problem: Climbing Stairs (#70)
 * Difficulty: Easy
 * Pattern: DP
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/climbing-stairs/
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) { int c = a + b; a = b; b = c; }
        return b;
    }
}
