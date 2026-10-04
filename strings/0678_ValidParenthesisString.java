/**
 * Problem: Valid Parenthesis String (#678)
 * Difficulty: Medium
 * Pattern: String
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/valid-parenthesis-string/
 */

class Solution {
    public boolean checkValidString(String s) {
        int low = 0;
        int high = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                low++;
                high++;
            } 
            else if (c == ')') {
                low--;
                high--;
            } 
            else { 
                low--;
                high++;
            }

            if (high < 0) {
                return false;
            }

            low = Math.max(low, 0);
        }

        return low == 0;
    }
}
