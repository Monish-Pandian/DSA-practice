/**
 * Problem: Minimum Moves to Equal Array Elements II (#462)
 * Difficulty: Medium
 * Pattern: Array
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/
 */

import java.util.*;
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid=nums[(nums.length-1)/2];
        int moves=0;
        for(int i:nums){
            moves+=Math.abs(i-mid);
        }
        return moves;
    }
}
