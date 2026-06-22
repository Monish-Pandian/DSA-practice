/**
 * Problem: Smallest Range I (#908)
 * Difficulty: Easy
 * Pattern: Math
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/smallest-range-i/
 */
public class SmallestRangeI {
    public int smallestRangeI(int[] nums, int k) {
        int min = nums[0], max = nums[0];
        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        return Math.max(0, max - min - 2 * k);
    }
}
