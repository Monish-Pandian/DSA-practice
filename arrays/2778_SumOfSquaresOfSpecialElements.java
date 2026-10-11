/**
 * Problem: Sum of Squares of Special Elements (#2778)
 * Difficulty: Medium
 * Pattern: Array
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/sum-of-squares-of-special-elements/
 */

class Solution {
    public int sumOfSquares(int[] nums) {
        int sum=0;
        int  n=nums.length;
        for(int i=0;i<n;i++){
            if(n%(i+1)==0){
                sum+=nums[i]*nums[i];
            }
        }
        return sum;
    }
}
