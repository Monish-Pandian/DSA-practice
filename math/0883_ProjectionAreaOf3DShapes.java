/**
 * Problem: Projection Area Of 3D Shapes (#883)
 * Difficulty: Easy
 * Pattern: Simulation
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/projection-area-of3-d-shapes/
 */
public class ProjectionAreaOf3DShapes {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int top = 0, front = 0, side = 0;
        for (int i = 0; i < n; i++) {
            int maxRow = 0, maxCol = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) top++;
                maxRow = Math.max(maxRow, grid[i][j]);
                maxCol = Math.max(maxCol, grid[j][i]);
            }
            front += maxRow;
            side  += maxCol;
        }
        return top + front + side;
    }
}
