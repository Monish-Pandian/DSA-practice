/*
Problem: 561. Array Partition
Pattern: Greedy + Sorting
Difficulty: Easy
Time Complexity: O(N log N)
Space Complexity: O(1)
Core Idea: Sort array and sum every alternate element (pairs).
*/
import java.util.*;
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int max=0;int count =0;int n=0;
        for(int i:nums){    
            count++;       
            if(count==2){
               int  min=Math.min(n,i);
                max=max+min;count=0;
            }
             n=i;
            
        } return max;
    }
}