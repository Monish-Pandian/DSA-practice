/**
 * Problem: Backspace String Compare (#844)
 * Difficulty: Easy
 * Pattern: Stack
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/backspace-string-compare/
 */
public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    private String build(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '#') sb.append(c);
            else if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
