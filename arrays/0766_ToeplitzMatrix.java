/**
 * Problem: Toeplitz Matrix (#766)
 * Difficulty: Easy
 * Pattern: Traversal
 * Time Complexity: O(n*m)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/toeplitz-matrix/
 */
public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++)
            for (int j = 1; j < matrix[0].length; j++)
                if (matrix[i][j] != matrix[i-1][j-1]) return false;
        return true;
    }
}
