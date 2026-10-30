/**
 * Problem: Shortest Path With At Most K Consecutive Identical Characters (#3970)
 * Difficulty: Medium
 * Pattern: String
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/shortest-path-with-at-most-k-consecutive-identical-characters/
 */

import java.util.*;
class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {

        List<int[]>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            graph[u].add(new int[]{v, w});
        }

        int[][] dist = new int[n][k + 1];

        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

        dist[0][1] = 0;
        pq.offer(new int[]{0, 0, 1});

        while (!pq.isEmpty()) {

            int[] current = pq.poll();

            int d = current[0];
            int u = current[1];
            int count = current[2];

            if (d != dist[u][count]) {
                continue;
            }

            if (u == n - 1) {
                return d;
            }

            for (int[] next : graph[u]) {

                int v = next[0];
                int w = next[1];

                int newCount;

                if (labels.charAt(u) == labels.charAt(v)) {
                    newCount = count + 1;
                } else {
                    newCount = 1;
                }

                if (newCount > k) {
                    continue;
                }

                int newDist = d + w;

                if (newDist < dist[v][newCount]) {

                    dist[v][newCount] = newDist;

                    pq.offer(new int[]{
                        newDist, v, newCount
                    });
                }
            }
        }

        return -1;
    }
}
