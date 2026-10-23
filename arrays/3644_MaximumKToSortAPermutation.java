/**
 * Problem: Maximum K to Sort a Permutation (#3644)
 * Difficulty: Medium
 * Pattern: Array
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/maximum-k-to-sort-a-permutation/
 */

class Solution {
    public int sortPermutation(int[] nums) {
        int n = nums.length;
        int ans = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] != i) {
                ans &= nums[i];
            }
        }

        return ans == -1 ? 0 : ans;
    }
}
