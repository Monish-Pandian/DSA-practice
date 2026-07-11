/**
 * Problem: Count the Number of Complete Components (#2685)
 * Difficulty: Medium
 * Pattern: Graph, DFS, Connected Components
 * Time Complexity: O(n + m)
 * Space Complexity: O(n + m)
 * LeetCode: https://leetcode.com/problems/count-the-number-of-complete-components/
 */

import java.util.*;

class Solution {

    int nodes;
    int degreeSum;

    public int countCompleteComponents(int n, int[][] edges) {

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[n];
        int ans = 0;

        for (int i = 0; i < n; i++) {

            if (!visited[i]) {

                nodes = 0;
                degreeSum = 0;

                dfs(i, graph, visited);

                int actualEdges = degreeSum / 2;
                int expectedEdges = nodes * (nodes - 1) / 2;

                if (actualEdges == expectedEdges) {
                    ans++;
                }
            }
        }

        return ans;
    }

    private void dfs(int node, List<List<Integer>> graph, boolean[] visited) {

        visited[node] = true;

        nodes++;
        degreeSum += graph.get(node).size();

        for (int next : graph.get(node)) {
            if (!visited[next]) {
                dfs(next, graph, visited);
            }
        }
    }
}