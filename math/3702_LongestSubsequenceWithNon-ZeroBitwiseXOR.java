/**
 * Problem: Longest Subsequence With Non-Zero Bitwise XOR (#3702)
 * Difficulty: Medium
 * Pattern: Mathematics, Bitwise XOR
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/longest-subsequence-with-non-zero-bitwise-xor/
 */
class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        boolean hasNonZero = false;

        for (int num : nums) {
            xor ^= num;
            if (num != 0) {
                hasNonZero = true;
            }
        }

        if (xor != 0) {
            return nums.length;
        }

        return hasNonZero ? nums.length - 1 : 0;
    }
}