/*
Problem: 169. Majority Element
Pattern: Boyer-Moore Voting
Difficulty: Easy
Time Complexity: O(N)
Space Complexity: O(1)
Core Idea: Maintain candidate and counter; majority element survives cancellation.
*/
class Solution {
    public int majorityElement(int[] nums) {
       int count=0;int candidate=0;
       for(int n:nums){
        if(count==0){
            candidate=n;
        }
        count+=(candidate==n)?1:-1;
       }
       return candidate; 
    }
}