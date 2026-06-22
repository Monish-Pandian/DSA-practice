import java.util.*;

/**
 * Problem: Number Of Recent Calls (#933)
 * Difficulty: Easy
 * Pattern: Queue
 * Time Complexity: O(1) amortized
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/number-of-recent-calls/
 */
public class NumberOfRecentCalls {
    private Deque<Integer> q = new ArrayDeque<>();

    public int ping(int t) {
        q.offer(t);
        while (q.peek() < t - 3000) q.poll();
        return q.size();
    }
}
