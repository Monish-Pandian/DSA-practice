/**
 * Problem: Shift 2D Grid (#1260)
 * Difficulty: Easy
 * Pattern: Array, Matrix, Index Mapping
 * Time Complexity: O(m × n)
 * Space Complexity: O(m × n)
 * LeetCode: https://leetcode.com/problems/shift-2d-grid/
 */

import java.util.*;
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;

        k %= total;

        int[][] ans = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int currentIndex = i * n + j;
                int newIndex = (currentIndex + k) % total;

                int newRow = newIndex / n;
                int newCol = newIndex % n;

                ans[newRow][newCol] = grid[i][j];
            }
        }

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(ans[i][j]);
            }
            result.add(row);
        }

        return result;
    }
}