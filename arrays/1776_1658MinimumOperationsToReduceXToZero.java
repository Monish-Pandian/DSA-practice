/**
 * Problem: 1658. Minimum Operations to Reduce X to Zero (#1776)
 * Difficulty: Medium
 * Pattern: Array, Two Pointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/
 */

class Solution {
    public int minOperations(int[] nums, int x) {

        int n = nums.length;

        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        int target = totalSum - x;

        if (target < 0) {
            return -1;
        }

        if (target == 0) {
            return n;
        }

        int left = 0;
        int windowSum = 0;
        int maxLength = -1;

        for (int right = 0; right < n; right++) {

            windowSum += nums[right];

            while (windowSum > target) {
                windowSum -= nums[left];
                left++;
            }

            if (windowSum == target) {
                maxLength = Math.max(
                    maxLength,
                    right - left + 1
                );
            }
        }

        if (maxLength == -1) {
            return -1;
        }

        return n - maxLength;
    }
}
