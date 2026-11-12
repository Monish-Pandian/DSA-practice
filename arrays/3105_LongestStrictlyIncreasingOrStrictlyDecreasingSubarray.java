/**
 * Problem: Longest Strictly Increasing or Strictly Decreasing Subarray (#3105)
 * Difficulty: Medium
 * Pattern: Array
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/
 */

class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        int inc = 1;
        int dec = 1;
        int max = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > nums[i - 1]) {
                inc++;
                dec = 1;
            }
            else if (nums[i] < nums[i - 1]) {
                dec++;
                inc = 1;
            }
            else {
                inc = 1;
                dec = 1;
            }

            max = Math.max(max, Math.max(inc, dec));
        }

        return max;
    }
}
