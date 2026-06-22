/**
 * Problem: Check If Array Is Good (#2784)
 * Difficulty: Easy
 * Pattern: HashSet
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/check-if-array-is-good/
 */
public class CheckIfArrayIsGood {
    public boolean isGood(int[] nums) {
        int n = nums.length - 1;
        int[] count = new int[n+2];
        for (int x : nums) { if (x < 1 || x > n) return false; count[x]++; }
        for (int i = 1; i < n; i++) if (count[i] != 1) return false;
        return count[n] == 2;
    }
}
