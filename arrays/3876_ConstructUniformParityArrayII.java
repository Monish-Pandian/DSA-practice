/**
 * Problem: Smallest Stable Index II
 * Difficulty: Medium
 * Pattern: Array, Prefix/Suffix, Preprocessing
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/smallest-stable-index-ii/
 */
class Solution {

    public boolean uniformArray(int[] nums1) {
        int mn = nums1[0];
        boolean hasOdd = false;
        for (int v : nums1) {
            if (v < mn) {
                mn = v;
            }
            if ((v & 1) == 1) {
                hasOdd = true;
            }
        }
        if ((mn & 1) == 1) {
            return true;
        }
        return !hasOdd;
    }
}