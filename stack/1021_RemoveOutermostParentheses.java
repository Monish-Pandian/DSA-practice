/**
 * Problem: Remove Outermost Parentheses (#1021)
 * Difficulty: Easy
 * Pattern: Stack
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/remove-outermost-parentheses/
 */
public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int depth = 0;
        for (char c : s.toCharArray()) {
            if (c == '(' && depth++ > 0) sb.append(c);
            if (c == ')' && depth-- > 1) sb.append(c);
        }
        return sb.toString();
    }
}
