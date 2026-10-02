/**
 * Problem: Generate Parentheses (#22)
 * Difficulty: Medium
 * Pattern: Array
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/generate-parentheses/
 */

import java.util.*;
class Solution {
    public List<String> generateParenthesis(int n) {
        StringBuilder s = new StringBuilder();
        List<String> l = new ArrayList<>();

        generatepara(s, 0, 0, l, n);

        return l;
    }

    private void generatepara(StringBuilder s, int open, int close,List<String> l, int n) {

        if (open == n && close == n) {
            l.add(s.toString());
            return;
        }

        if (open < n) {
            s.append('(');
            generatepara(s, open + 1, close, l, n);
            s.deleteCharAt(s.length() - 1);
        }

        if (close < open) {
            s.append(')');
            generatepara(s, open, close + 1, l, n);
            s.deleteCharAt(s.length() - 1);
        }
    }
}
