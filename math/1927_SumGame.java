/**
 * Problem: Sum Game (#1927)
 * Difficulty: Medium
 * Pattern: Greedy, Math, Game Theory
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/sum-game/
 */
class Solution {
    public boolean sumGame(String num) {
        int n = num.length();

        int leftSum = 0;
        int rightSum = 0;
        int leftQ = 0;
        int rightQ = 0;

        for (int i = 0; i < n / 2; i++) {
            char c = num.charAt(i);

            if (c == '?') {
                leftQ++;
            } else {
                leftSum += c - '0';
            }
        }

        for (int i = n / 2; i < n; i++) {
            char c = num.charAt(i);

            if (c == '?') {
                rightQ++;
            } else {
                rightSum += c - '0';
            }
        }

        int diff = leftSum - rightSum;
        int qDiff = leftQ - rightQ;

        if (qDiff == 0) {
            return diff != 0;
        }

 
        if (qDiff % 2 != 0) {
            return true;
        }

        return diff + 9 * (qDiff / 2) != 0;
    }
}