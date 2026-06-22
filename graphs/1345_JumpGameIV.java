/**
 * Problem: Jump Game I V (#1345)
 * Difficulty: Hard
 * Pattern: BFS
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/jump-game-i-v/
 */
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class JumpGameIV {
    public int minJumps(int[] arr) {
        int n = arr.length;
        if (n == 1) return 0;

        // Group indices by value for same-value jumps
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
        }

        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(0);
        visited[0] = true;
        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            steps++;
            while (size-- > 0) {
                int idx = queue.poll();

                // Jump left
                if (idx - 1 >= 0 && !visited[idx - 1]) {
                    if (idx - 1 == n - 1) return steps;
                    visited[idx - 1] = true;
                    queue.offer(idx - 1);
                }
                // Jump right
                if (idx + 1 < n && !visited[idx + 1]) {
                    if (idx + 1 == n - 1) return steps;
                    visited[idx + 1] = true;
                    queue.offer(idx + 1);
                }
                // Jump to all same-value indices
                List<Integer> sameVal = graph.getOrDefault(arr[idx], new ArrayList<>());
                for (int next : sameVal) {
                    if (!visited[next]) {
                        if (next == n - 1) return steps;
                        visited[next] = true;
                        queue.offer(next);
                    }
                }
                // Clear to avoid revisiting same-value group
                sameVal.clear();
            }
        }

        return -1; // unreachable
    }
}
