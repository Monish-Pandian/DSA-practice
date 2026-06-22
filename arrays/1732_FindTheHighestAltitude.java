/**
 * Problem: Find The Highest Altitude (#1732)
 * Difficulty: Easy
 * Pattern: PrefixSum
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/find-the-highest-altitude/
 */
public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int max = 0, cur = 0;
        for (int g : gain) { cur += g; max = Math.max(max, cur); }
        return max;
    }
}
