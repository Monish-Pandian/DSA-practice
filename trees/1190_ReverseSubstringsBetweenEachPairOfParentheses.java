/**
 * Problem: Reverse Substrings Between Each Pair of Parentheses (#1190)
 * Difficulty: Medium
 * Pattern: Binary Tree
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/
 */

class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> st = new Stack<>();
        StringBuilder current = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (c == '(') {
                st.push(current);
                current = new StringBuilder();

            } else if (c == ')') {
                current.reverse();

                StringBuilder previous = st.pop();
                previous.append(current);

                current = previous;

            } else {
                current.append(c);
            }
        }

        return current.toString();
    }
}
