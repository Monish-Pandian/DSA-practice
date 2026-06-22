/**
 * Problem: Surface Area Of 3D Shapes (#892)
 * Difficulty: Easy
 * Pattern: Simulation
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/surface-area-of3-d-shapes/
 */
public class SurfaceAreaOf3DShapes {
    public int surfaceArea(int[][] grid) {
        int n = grid.length, area = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    area += 4 * grid[i][j] + 2;
                    if (i > 0) area -= 2 * Math.min(grid[i][j], grid[i-1][j]);
                    if (j > 0) area -= 2 * Math.min(grid[i][j], grid[i][j-1]);
                }
            }
        }
        return area;
    }
}
