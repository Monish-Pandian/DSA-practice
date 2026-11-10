/**
 * Problem: Climbing Stairs II (#3693)
 * Difficulty: Medium
 * Pattern: Dynamic Programming
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/climbing-stairs-ii/
 */

class Solution {

    public int climbStairs(int n, int[] costs) {
        int a = 0,
            b = 0,
            c = 0;
        for (int i = 0; i < n; ++i) {
            int nxt = Math.min(Math.min(a + 9, b + 4), c + 1) + costs[i];
            a = b;
            b = c;
            c = nxt;
        }
        return c;
    }
}
