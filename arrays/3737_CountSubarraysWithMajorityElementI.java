/**
 * Problem: Count Majority Subarrays(#3737)
 * Difficulty: Med.
 * Pattern: Prefix Sum, Counting
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 * LeetCode:https://leetcode.com/problems/count-subarrays-with-majority-element-i/
 */

class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
         int count=0;
         int sum;
        for(int i=0;i<nums.length;i++){
            sum=0;
            for(int j=i;j<nums.length;j++){
                sum += (nums[j] == target ? 1 : -1);
               if(sum>0){
                count++;
               }
            }

        }
        return  count;
    }
}