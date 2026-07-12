/**
 * Problem: Course Schedule (#207)
 * Difficulty: Medium
 * Pattern: Graph, DFS, Cycle Detection
 * Time Complexity: O(V + E)
 * Space Complexity: O(V + E)
 * LeetCode: https://leetcode.com/problems/course-schedule/
 */

import java.util.*;
class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }


        for (int[] edge : prerequisites) {
            graph.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] pathVisited = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                if (dfs(i, graph, visited, pathVisited)) {
                    return false;   
                }
            }
        }

        return true;
    }

    private boolean dfs(int node,
                        List<List<Integer>> graph,
                        boolean[] visited,
                        boolean[] pathVisited) {

        visited[node] = true;
        pathVisited[node] = true;

        for (int neighbor : graph.get(node)) {

            if (!visited[neighbor]) {
                if (dfs(neighbor, graph, visited, pathVisited)) {
                    return true;
                }
            }
            else if (pathVisited[neighbor]) {
                return true;
            }
        }

        pathVisited[node] = false;
        return false;
    }
}