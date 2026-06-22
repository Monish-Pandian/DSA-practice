/**
 * Problem: Island Perimeter (#463)
 * Difficulty: Easy
 * Pattern: DFS
 * Time Complexity: O(n*m)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/island-perimeter/
 */
public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int perimeter = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1) {
                    // Each land cell starts with 4 sides
                    perimeter += 4;
                    // Subtract shared edges with adjacent land cells
                    if (r > 0 && grid[r - 1][c] == 1) perimeter -= 2; // top neighbor
                    if (c > 0 && grid[r][c - 1] == 1) perimeter -= 2; // left neighbor
                }
            }
        }

        return perimeter;
    }
}
