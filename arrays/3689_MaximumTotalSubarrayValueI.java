/**
 * Problem: Maximum Total Subarray Value I (#3689)
 * Difficulty: Med.
 * Pattern: SlidingWindow
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/maximum-total-subarray-value-i/
 */
public class MaximumTotalSubarrayValueI {
    public long maximumTotalCost(int[] nums) {
        long pos = nums[0], neg = nums[0], res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            long newPos = Math.max(nums[i], neg + nums[i]);
            long newNeg = Math.max(nums[i], pos - nums[i]);
            pos = newPos; neg = newNeg;
            res = Math.max(res, Math.max(pos, neg));
        }
        return res;
    }
}
