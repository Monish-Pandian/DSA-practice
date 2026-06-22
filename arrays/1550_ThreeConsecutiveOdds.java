/**
 * Problem: Three Consecutive Odds (#1550)
 * Difficulty: Easy
 * Pattern: SlidingWindow
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/three-consecutive-odds/
 */
public class ThreeConsecutiveOdds {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int n : arr) { count = n%2==1 ? count+1 : 0; if (count == 3) return true; }
        return false;
    }
}
