/**
 * Problem: Jump Game I I I (#1306)
 * Difficulty: Med.
 * Pattern: BFS
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/jump-game-i-i-i/
 */
import java.util.ArrayDeque;
import java.util.Queue;

public class JumpGameIII {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int idx = queue.poll();
            if (arr[idx] == 0) return true;

            int left = idx - arr[idx];
            int right = idx + arr[idx];

            if (left >= 0 && !visited[left]) {
                visited[left] = true;
                queue.offer(left);
            }
            if (right < n && !visited[right]) {
                visited[right] = true;
                queue.offer(right);
            }
        }

        return false;
    }
}
