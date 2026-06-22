import java.util.*;

/**
 * Problem: Baseball Game (#682)
 * Difficulty: Easy
 * Pattern: Stack
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/baseball-game/
 */
public class BaseballGame {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String op : operations) {
            if (op.equals("+")) {
                int top = stack.pop();
                int val = top + stack.peek();
                stack.push(top);
                stack.push(val);
            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (op.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for (int n : stack) sum += n;
        return sum;
    }
}
