import java.util.*;

/**
 * Problem: Implement Queue Using Stacks (#232)
 * Difficulty: Easy
 * Pattern: Stack
 * Time Complexity: O(1) amortized
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/implement-queue-using-stacks/
 */
public class ImplementQueueUsingStacks {
    private Deque<Integer> in = new ArrayDeque<>(), out = new ArrayDeque<>();

    public void push(int x) { in.push(x); }

    public int pop() { peek(); return out.pop(); }

    public int peek() {
        if (out.isEmpty()) while (!in.isEmpty()) out.push(in.pop());
        return out.peek();
    }

    public boolean empty() { return in.isEmpty() && out.isEmpty(); }
}
