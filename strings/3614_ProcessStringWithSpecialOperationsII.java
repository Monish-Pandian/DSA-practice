import java.util.*;

/**
 * Problem: Process String With Special Operations II (#3614)
 * Difficulty: Hard
 * Pattern: Stack
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/process-string-with-special-operations-ii/
 */
public class ProcessStringWithSpecialOperationsII {
    public String processStr(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        boolean reversed = false;
        for (char c : s.toCharArray()) {
            if (c == '*') {
                if (!stack.isEmpty()) {
                    if (reversed) stack.pollFirst(); else stack.pollLast();
                }
            } else if (c == '%') {
                reversed = !reversed;
            } else if (c == '#') {
                List<Character> copy = new ArrayList<>(stack);
                for (char x : copy) {
                    if (reversed) stack.offerFirst(x); else stack.offerLast(x);
                }
            } else {
                if (reversed) stack.offerFirst(c); else stack.offerLast(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) sb.append(c);
        return reversed ? sb.reverse().toString() : sb.toString();
    }
}
