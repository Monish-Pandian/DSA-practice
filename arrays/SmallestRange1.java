/*
Problem: 908. Smallest Range I
Pattern: Math
Difficulty: Easy
Time Complexity: O(N)
Space Complexity: O(1)
Core Idea: Reduce the range by adjusting the minimum and maximum values within the allowed K limit.
*/
class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            max=Math.max(i,max);
            min=Math.min(i,min);
        }
        return Math.max(0,(max-min)-2*k);
    }
}