/**
 * Problem: Transpose Matrix (#867)
 * Difficulty: Easy
 * Pattern: Simulation
 * Time Complexity: O(n*m)
 * Space Complexity: O(n*m)
 * LeetCode: https://leetcode.com/problems/transpose-matrix/
 */
public class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] res = new int[n][m];
        for (int i = 0; i < m; i++) for (int j = 0; j < n; j++) res[j][i] = matrix[i][j];
        return res;
    }
}
