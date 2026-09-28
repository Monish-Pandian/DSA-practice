/**
 * Problem: Maximum Nesting Depth of the Parentheses (#1614)
 * Difficulty: Medium
 * Pattern: String
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
 */

class Solution {
    public int maxDepth(String s) {
        int count=0;
        int max=0;
        for(char c:s.toCharArray()){
            if(c=='(')count++;
            if(c==')')count--;
            max=Math.max(max,count);
        }
        return max;
    }
}
