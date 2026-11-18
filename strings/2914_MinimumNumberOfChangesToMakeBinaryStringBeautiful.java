/**
 * Problem: Minimum Number of Changes to Make Binary String Beautiful (#2914)
 * Difficulty: Medium
 * Pattern: String
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/minimum-number-of-changes-to-make-binary-string-beautiful/
 */

class Solution {

    public int minChanges(String s) {
        int minChangesRequired = 0;
        for (int i = 0; i < s.length(); i += 2) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                minChangesRequired++;
            }
        }

        return minChangesRequired;
    }
}
