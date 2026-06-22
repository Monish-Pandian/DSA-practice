/**
 * Problem: Maximum Building Height (#1840)
 * Difficulty: Hard
 * Pattern: Math+Greedy
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/maximum-building-height/
 */
import java.util.Arrays;
public class MaximumBuildingHeight {
    public int maxBuilding(int n, int[][] restrictions) {
        Arrays.sort(restrictions, (a, b) -> a[0] - b[0]);
        int m = restrictions.length;

        // Forward pass: propagate height limits left to right
        for (int i = 1; i < m; i++) {
            restrictions[i][1] = Math.min(restrictions[i][1],
                restrictions[i-1][1] + restrictions[i][0] - restrictions[i-1][0]);
        }
        // Backward pass: propagate height limits right to left
        for (int i = m - 2; i >= 0; i--) {
            restrictions[i][1] = Math.min(restrictions[i][1],
                restrictions[i+1][1] + restrictions[i+1][0] - restrictions[i][0]);
        }

        int ans = 0;
        // Height between building 1 and first restriction
        if (m > 0) ans = restrictions[0][0] - 1;

        // Height between consecutive restrictions
        for (int i = 1; i < m; i++) {
            int dist = restrictions[i][0] - restrictions[i-1][0];
            int peak = (dist + restrictions[i][1] + restrictions[i-1][1]) / 2;
            ans = Math.max(ans, peak);
        }
        // Height between last restriction and building n
        if (m > 0) {
            ans = Math.max(ans, restrictions[m-1][1] + n - restrictions[m-1][0]);
        } else {
            ans = n - 1;
        }
        return ans;
    }
}
