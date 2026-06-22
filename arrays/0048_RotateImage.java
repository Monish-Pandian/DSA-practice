/**
 * Problem: Rotate Image (#48)
 * Difficulty: Med.
 * Pattern: InPlace
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/rotate-image/
 */
public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // Transpose
        for (int i = 0; i < n; i++)
            for (int j = i+1; j < n; j++) {
                int t = matrix[i][j]; matrix[i][j] = matrix[j][i]; matrix[j][i] = t;
            }
        // Reverse each row
        for (int[] row : matrix) {
            int l = 0, r = n-1;
            while (l < r) { int t = row[l]; row[l++] = row[r]; row[r--] = t; }
        }
    }
}
