/**
 * Problem: Minimum Deletions to Remove Min and Max (#2091)
 * Difficulty: Medium
 * Pattern: Array, Greedy
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/removing-minimum-and-maximum-from-array/
 */

class Solution {

    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minidx = 0,
            maxidx = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] < nums[minidx]) {
                minidx = i;
            }
            if (nums[i] > nums[maxidx]) {
                maxidx = i;
            }
        }

        int l = Math.min(minidx, maxidx);
        int r = Math.max(minidx, maxidx); 

        return Math.min(Math.min(r + 1, n - l), l + 1 + n - r);
    }
}