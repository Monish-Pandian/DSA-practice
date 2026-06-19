/*
Problem: 661. Image Smoother
Pattern: Matrix Traversal
Difficulty: Easy
Time Complexity: O(M*N)
Space Complexity: O(M*N)
Core Idea: For each cell, calculate the average of all valid neighboring cells (including itself) and store the result in a new matrix.
*/
class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                int count = 0;

                for (int r = i - 1; r <= i + 1; r++) {
                    for (int c = j - 1; c <= j + 1; c++) {
                        if (r >= 0 && r < m && c >= 0 && c < n) {
                            sum += img[r][c];
                            count++;
                        }
                    }
                }

                res[i][j] = sum / count;
            }
        }

        return res;
    }
}