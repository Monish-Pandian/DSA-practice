/**
 * Problem: Reshape The Matrix (#566)
 * Difficulty: Easy
 * Pattern: Simulation
 * Time Complexity: O(n*m)
 * Space Complexity: O(n*m)
 * LeetCode: https://leetcode.com/problems/reshape-the-matrix/
 */
public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if (m*n != r*c) return mat;
        int[][] res = new int[r][c];
        for (int i = 0; i < m*n; i++) res[i/c][i%c] = mat[i/n][i%n];
        return res;
    }
}
