/*
Problem: 485. Max Consecutive Ones
Pattern: Array Traversal
Difficulty: Easy
Time Complexity: O(N)
Space Complexity: O(1)
Core Idea: Traverse the array, count consecutive 1s, reset on 0, and track the maximum streak.
*/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;int max=0;
        for(int i:nums){
            if(i==1){
                count++;
                max=Math.max(max,count);
            }else{
               count=0;
            }
            
        }
        return max;
    }
}