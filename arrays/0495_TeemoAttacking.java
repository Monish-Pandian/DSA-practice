/**
 * Problem: Teemo Attacking (#495)
 * Difficulty: Easy
 * Pattern: Simulation
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/teemo-attacking/
 */
public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;
        for (int i = 0; i < timeSeries.length - 1; i++)
            total += Math.min(duration, timeSeries[i+1] - timeSeries[i]);
        return total + duration;
    }
}
