/**
 * Problem: Longest Continuous Increasing Subsequence (#674)
 * Difficulty: Easy
 * Pattern: SlidingWindow
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/longest-continuous-increasing-subsequence/
 */
public class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        int max = 1, cur = 1;
        for (int i = 1; i < nums.length; i++) {
            cur = nums[i] > nums[i-1] ? cur+1 : 1;
            max = Math.max(max, cur);
        }
        return max;
    }
}
