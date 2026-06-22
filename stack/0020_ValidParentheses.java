import java.util.*;

/**
 * Problem: Valid Parentheses (#20)
 * Difficulty: Easy
 * Pattern: Stack
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') stack.push(c);
            else if (stack.isEmpty()) return false;
            else if (c == ')' && stack.peek() != '(') return false;
            else if (c == ']' && stack.peek() != '[') return false;
            else if (c == '}' && stack.peek() != '{') return false;
            else stack.pop();
        }
        return stack.isEmpty();
    }
}
