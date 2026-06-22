/**
 * Problem: Rotating The Box (#1861)
 * Difficulty: Med.
 * Pattern: TwoPointers
 * Time Complexity: O(n*m)
 * Space Complexity: O(n*m)
 * LeetCode: https://leetcode.com/problems/rotating-the-box/
 */
public class RotatingTheBox {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length, n = box[0].length;
        // Gravity: stones fall right
        for (char[] row : box) {
            int empty = n-1;
            for (int j = n-1; j >= 0; j--) {
                if (row[j] == '*') empty = j-1;
                else if (row[j] == '#') { row[j] = '.'; row[empty--] = '#'; }
            }
        }
        // Rotate 90 degrees clockwise
        char[][] res = new char[n][m];
        for (int i = 0; i < m; i++) for (int j = 0; j < n; j++) res[j][m-1-i] = box[i][j];
        return res;
    }
}
