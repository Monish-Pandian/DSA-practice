/**
 * Problem: Max Number of Balloons (#1189)
 * Difficulty: Easy
 * Pattern:Frequency Counting
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * LeetCode: https://leetcode.com/problems/maximum-number-of-balloons/
 */
class Solution {
    public int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;

        for (char c : text.toCharArray()) {
            switch (c) {
                case 'b': b++; break;
                case 'a': a++; break;
                case 'l': l++; break;
                case 'o': o++; break;
                case 'n': n++; break;
            }
        }

        return Math.min(
            Math.min(b, a),
            Math.min(l / 2, Math.min(o / 2, n))
        );
    }
}
