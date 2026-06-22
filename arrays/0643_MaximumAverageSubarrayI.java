/**
 * Problem: Maximum Average Subarray I (#643)
 * Difficulty: Easy
 * Pattern: SlidingWindow
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/maximum-average-subarray-i/
 */
public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) sum += nums[i];
        int max = sum;
        for (int i = k; i < nums.length; i++) { sum += nums[i] - nums[i-k]; max = Math.max(max, sum); }
        return (double) max / k;
    }
}
