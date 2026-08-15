/**
 * Problem: Minimum Cost to Make at Least One Valid Path in a Grid (#1368)
 * Difficulty: Hard
 * Pattern: 0-1 BFS, Graph, Shortest Path
 * Time Complexity: O(m × n)
 * Space Complexity: O(m × n)
 * LeetCode: https://leetcode.com/problems/minimum-cost-to-make-at-least-one-valid-path-in-a-grid/
 */

import java.util.*;
class Solution {
    public int minCost(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[][] dist = new int[m][n];

        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        int[][] dir = {
            {0, 1},   
            {0, -1}, 
            {1, 0},  
            {-1, 0}   
        };

        Deque<int[]> deque = new ArrayDeque<>();

        dist[0][0] = 0;
        deque.offerFirst(new int[]{0, 0});

        while (!deque.isEmpty()) {

            int[] cur = deque.pollFirst();

            int row = cur[0];
            int col = cur[1];

            for (int i = 0; i < 4; i++) {

                int newRow = row + dir[i][0];
                int newCol = col + dir[i][1];

                if (newRow < 0 || newRow >= m ||
                    newCol < 0 || newCol >= n) {
                    continue;
                }

                int cost;

                if (grid[row][col] == i + 1) {
                    cost = 0;
                } else {
                    cost = 1;
                }

                int newCost = dist[row][col] + cost;

                if (newCost < dist[newRow][newCol]) {

                    dist[newRow][newCol] = newCost;

                    if (cost == 0) {
                        deque.offerFirst(
                            new int[]{newRow, newCol}
                        );
                    } else {
                        deque.offerLast(
                            new int[]{newRow, newCol}
                        );
                    }
                }
            }
        }

        return dist[m - 1][n - 1];
    }
}