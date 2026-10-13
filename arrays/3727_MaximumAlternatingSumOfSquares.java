/**
 * Problem: Maximum Alternating Sum of Squares (#3727)
 * Difficulty: Medium
 * Pattern: Array
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/maximum-alternating-sum-of-squares/
 */

import java.util.*;
class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        int sum=0;int k;
        for(int i=0;i<n;i++){
            nums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        if(n%2!=0){ k=2;}
        else {k=1;}
        for(int i=0;i<(n/2);i++){
            sum+=(nums[n-i-k]*nums[n-i-k])-(nums[i]*nums[i]);
        }
        if(n%2==0){return sum;}
        else{return sum+(nums[n-1])*(nums[n-1]);}
    }
}
