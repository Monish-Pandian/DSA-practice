/**
 * Problem: Maximize Sum of Squares of Digits (#3723)
 * Difficulty: Medium
 * Pattern: String
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/maximize-sum-of-squares-of-digits/
 */

class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > num * 9) {
            return "";
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < num; i++) {
            int digit = Math.min(9, sum);
            ans.append(digit);
            sum -= digit;
        }

        return ans.toString();
    }
}
