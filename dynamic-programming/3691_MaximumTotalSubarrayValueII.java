/**
 * Problem: Maximum Total Subarray Value II (#3691)
 * Difficulty: Hard
 * Pattern: DP
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/maximum-total-subarray-value-ii/
 */
public class MaximumTotalSubarrayValueII {
    public long maximumTotalCost(int[] nums) {
        // dp[i] with positive last: best subarray ending at i with nums[i] added positively
        // dp[i] with negative last: best subarray ending at i with nums[i] subtracted
        long pos = nums[0], neg = nums[0], res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            long newPos = Math.max(nums[i], neg + nums[i]);
            long newNeg = Math.max(nums[i], pos - nums[i]);
            pos = newPos;
            neg = newNeg;
            res = Math.max(res, Math.max(pos, neg));
        }
        return res;
    }
}
