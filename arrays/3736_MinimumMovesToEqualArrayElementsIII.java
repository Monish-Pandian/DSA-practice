/**
 * Problem: Minimum Moves to Equal Array Elements III (#3736)
 * Difficulty: Medium
 * Pattern: Array
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/minimum-moves-to-equal-array-elements-iii/
 */

class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i:nums){
           max=Math.max(i,max);
        }
        int res=0;
        for(int i:nums){
            res+=(max-i);
        }
        return res;
    }
}
