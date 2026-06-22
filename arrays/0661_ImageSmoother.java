/**
 * Problem: Image Smoother (#661)
 * Difficulty: Easy
 * Pattern: Simulation
 * Time Complexity: O(n*m)
 * Space Complexity: O(n*m)
 * LeetCode: https://leetcode.com/problems/image-smoother/
 */
public class ImageSmoother {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length, n = img[0].length;
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) for (int j = 0; j < n; j++) {
            int sum = 0, cnt = 0;
            for (int di = -1; di <= 1; di++) for (int dj = -1; dj <= 1; dj++) {
                int ni = i+di, nj = j+dj;
                if (ni >= 0 && ni < m && nj >= 0 && nj < n) { sum += img[ni][nj]; cnt++; }
            }
            res[i][j] = sum / cnt;
        }
        return res;
    }
}
