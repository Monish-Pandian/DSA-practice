/**
 * Problem: Minimum Score of a Path Between Two Cities (#2492)
 * Difficulty: Medium
 * Pattern: Graph, DFS
 * Time Complexity: O(V + E)
 * Space Complexity: O(V + E)
 * LeetCode: https://leetcode.com/problems/minimum-score-of-a-path-between-two-cities/
 */

import java.util.*;
class Solution {

    int ans = Integer.MAX_VALUE;

    public int minScore(int n, int[][] roads) {

        List<List<int[]>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] road : roads) {
            graph.get(road[0]).add(new int[]{road[1], road[2]});
            graph.get(road[1]).add(new int[]{road[0], road[2]});
        }

        boolean[] visited = new boolean[n + 1];

        dfs(1, graph, visited);

        return ans;
    }

    private void dfs(int node, List<List<int[]>> graph, boolean[] visited) {

        visited[node] = true;

        for (int[] nei : graph.get(node)) {

            ans = Math.min(ans, nei[1]);

            if (!visited[nei[0]]) {
                dfs(nei[0], graph, visited);
            }
        }
    }
}