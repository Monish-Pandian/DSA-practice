/**
 * Problem: Largest Triangle Area (#812)
 * Difficulty: Easy
 * Pattern: BruteForce
 * Time Complexity: O(n³)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/largest-triangle-area/
 */
public class LargestTriangleArea {
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double max = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                for (int k = j + 1; k < n; k++)
                    max = Math.max(max, area(points[i], points[j], points[k]));
        return max;
    }
    private double area(int[] a, int[] b, int[] c) {
        return 0.5 * Math.abs(
            a[0] * (b[1] - c[1]) +
            b[0] * (c[1] - a[1]) +
            c[0] * (a[1] - b[1])
        );
    }
}
