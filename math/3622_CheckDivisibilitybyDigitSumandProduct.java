/**
 * Problem: Check Divisibility by Digit Sum and Product (#2575)
 * Difficulty: Easy
 * Pattern: Math, Digit Manipulation
 * Time Complexity: O(log10(n))
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/
 */

class Solution {

    public boolean checkDivisibility(int n) {
        int digitSum = 0;
        int digitProduct = 1;
        int original = n;

        while (n > 0) {
            int digit = n % 10;
            n /= 10;

            digitSum += digit;
            digitProduct *= digit;
        }

        return original % (digitSum + digitProduct) == 0;
    }
}