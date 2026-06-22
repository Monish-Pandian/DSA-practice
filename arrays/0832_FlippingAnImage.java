/**
 * Problem: Flipping An Image (#832)
 * Difficulty: Easy
 * Pattern: TwoPointers
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/flipping-an-image/
 */
public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            int l = 0, r = row.length-1;
            while (l <= r) {
                int t = row[l] ^ 1;
                row[l++] = row[r] ^ 1;
                row[r--] = t;
            }
        }
        return image;
    }
}
