/**
 * Problem: Maximum Nesting Depth of Two Valid Parentheses Strings (#1111)
 * Difficulty: Medium
 * Pattern: Stack
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/maximum-nesting-depth-of-two-valid-parentheses-strings/
 */

class Solution {

    public int[] maxDepthAfterSplit(String seq) {
        int d = 0;
        int length = seq.length();
        int[] ans = new int[length];
        for (int i = 0; i < length; i++) {
            if (seq.charAt(i) == '(') {
                ++d;
                ans[i] = d % 2;
            } else {
                ans[i] = d % 2;
                --d;
            }
        }
        return ans;
    }
}
