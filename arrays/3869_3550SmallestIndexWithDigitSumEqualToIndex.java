/**
 * Problem: 3550. Smallest Index With Digit Sum Equal to Index (#3869)
 * Difficulty: Medium
 * Pattern: Array
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/smallest-index-with-digit-sum-equal-to-index/
 */

class Solution {
    public int smallestIndex(int[] nums) {
       for(int i=0;i<nums.length;i++){
        int n=nums[i];int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        if(sum==i)return i;
       } 
       return -1;
    }
}
