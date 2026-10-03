/**
 * Problem: Longest Valid Parentheses (#32)
 * Difficulty: Medium
 * Pattern: Stack
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/longest-valid-parentheses/
 */

class Solution {
    public int longestValidParentheses(String s) {

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                stack.push(i);
            } 
            else {
                stack.pop();

                if (stack.isEmpty()) {
                    stack.push(i);
                } 
                else {
                    int length = i - stack.peek();
                    max = Math.max(max, length);
                }
            }
        }

        return max;
    }
}
