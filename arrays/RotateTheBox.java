/*
Problem: 1861. Rotating the Box
Pattern: Matrix Simulation
Difficulty: Medium
Time Complexity: O(M*N)
Space Complexity: O(M*N)
Core Idea: First simulate gravity by moving stones (#) to the right until blocked by an obstacle (*), then rotate the box 90° clockwise.
*/
class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m = boxGrid.length;
        int n = boxGrid[0].length;

        for (int i = 0; i < m; i++) {
            int empty = n - 1; 

            for (int j = n - 1; j >= 0; j--) {
                if (boxGrid[i][j] == '*') {
                    empty = j - 1;
                } 
                else if (boxGrid[i][j] == '#') {
                    char temp = boxGrid[i][empty];
                    boxGrid[i][empty] = '#';
                    boxGrid[i][j] = temp;
                    empty--;
                }
            }
        }

        char[][] result = new char[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][m - 1 - i] = boxGrid[i][j];
            }
        }

        return result;
    }
}