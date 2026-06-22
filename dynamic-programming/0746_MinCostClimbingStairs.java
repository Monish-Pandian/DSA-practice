/**
 * Problem: Min Cost Climbing Stairs (#746)
 * Difficulty: Easy
 * Pattern: DP
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/min-cost-climbing-stairs/
 */
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int a = cost[0], b = cost[1];
        for (int i = 2; i < cost.length; i++) {
            int c = cost[i] + Math.min(a, b);
            a = b; b = c;
        }
        return Math.min(a, b);
    }
}
