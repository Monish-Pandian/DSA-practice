/**
 * Problem: Path With Minimum Effort (#1631)
 * Difficulty: Medium
 * Pattern: Graph, Dijkstra's Algorithm, Priority Queue
 * Time Complexity: O(mn log(mn))
 * Space Complexity: O(mn)
 * LeetCode: https://leetcode.com/problems/path-with-minimum-effort/
 */
import java.util.*;
class Solution {
    public int minimumEffortPath(int[][] heights) {

        int[][] dir = {
            {0, 1},
            {1, 0},
            {-1, 0},
            {0, -1}
        };

        int m = heights.length;
        int n = heights[0].length;

        int[][] efforts = new int[m][n];

        for (int[] row : efforts) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        efforts[0][0] = 0;

        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a, b) ->
                Integer.compare(a[0], b[0])
            );

        pq.offer(new int[]{0, 0, 0});

        while (!pq.isEmpty()) {

            int[] cur = pq.poll();

            int currentEffort = cur[0];
            int row = cur[1];
            int col = cur[2];

            if (row == m - 1 && col == n - 1) {
                return currentEffort;
            }

            for (int i = 0; i < 4; i++) {

                int newRow = row + dir[i][0];
                int newCol = col + dir[i][1];

                if (newRow < 0 || newCol < 0 ||
                    newRow >= m || newCol >= n) {
                    continue;
                }

                int diff = Math.abs(
                    heights[row][col] -
                    heights[newRow][newCol]
                );

                int newEffort =
                    Math.max(currentEffort, diff);

                if (newEffort < efforts[newRow][newCol]) {

                    efforts[newRow][newCol] = newEffort;

                    pq.offer(new int[]{
                        newEffort,
                        newRow,
                        newCol
                    });
                }
            }
        }

        return 0;
    }
}