/**
 * Problem: The Kth Factor Of N (#1492)
 * Difficulty: Med.
 * Pattern: Traversal
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/the-kth-factor-of-n/
 */
public class TheKthFactorOfN {
    public int kthFactor(int n, int k) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && --k == 0) return i;
        }
        return -1;
    }
}
