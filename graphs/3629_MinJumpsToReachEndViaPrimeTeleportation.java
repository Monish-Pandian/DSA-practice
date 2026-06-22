/**
 * Problem: Min Jumps To Reach End Via Prime Teleportation (#3629)
 * Difficulty: Med.
 * Pattern: BFS+Sieve
 * Time Complexity: O(n log log n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/min-jumps-to-reach-end-via-prime-teleportation/
 */
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class MinJumpsToReachEndViaPrimeTeleportation {
    public int minJumps(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0;

        // Find max value to build sieve
        int maxVal = 0;
        for (int x : nums) maxVal = Math.max(maxVal, x);

        // Smallest prime factor sieve
        int[] spf = new int[maxVal + 1];
        for (int i = 0; i <= maxVal; i++) spf[i] = i;
        for (int i = 2; (long) i * i <= maxVal; i++) {
            if (spf[i] == i) { // i is prime
                for (int j = i * i; j <= maxVal; j += i) {
                    if (spf[j] == j) spf[j] = i;
                }
            }
        }

        // Group indices by each prime factor of nums[i]
        Map<Integer, List<Integer>> primeToIndices = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int val = nums[i];
            // Extract all distinct prime factors
            while (val > 1) {
                int p = spf[val];
                primeToIndices.computeIfAbsent(p, k -> new ArrayList<>()).add(i);
                while (val % p == 0) val /= p;
            }
        }

        // BFS: can move to i±1 or any index sharing a prime factor
        boolean[] visited = new boolean[n];
        boolean[] primeUsed = new boolean[maxVal + 1];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(0);
        visited[0] = true;
        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            steps++;
            while (size-- > 0) {
                int idx = queue.poll();

                // Neighbors: left, right
                for (int next : new int[]{idx - 1, idx + 1}) {
                    if (next >= 0 && next < n && !visited[next]) {
                        if (next == n - 1) return steps;
                        visited[next] = true;
                        queue.offer(next);
                    }
                }

                // Prime teleportation
                int val = nums[idx];
                while (val > 1) {
                    int p = spf[val];
                    if (!primeUsed[p]) {
                        primeUsed[p] = true;
                        for (int next : primeToIndices.getOrDefault(p, new ArrayList<>())) {
                            if (!visited[next]) {
                                if (next == n - 1) return steps;
                                visited[next] = true;
                                queue.offer(next);
                            }
                        }
                    }
                    while (val % p == 0) val /= p;
                }
            }
        }

        return -1; // unreachable
    }
}
