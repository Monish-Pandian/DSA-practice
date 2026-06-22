/**
 * Problem: Sqrt(x) (#69)
 * Difficulty: Easy
 * Pattern: BinarySearch
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/sqrtx/
 */
public class SqrtX {
    public int mySqrt(int x) {
        if (x < 2) return x;
        int l = 1, r = x / 2;
        while (l <= r) {
            long mid = l + (r - l) / 2;
            if (mid * mid == x) return (int) mid;
            else if (mid * mid < x) l = (int) mid + 1;
            else r = (int) mid - 1;
        }
        return r;
    }
}
