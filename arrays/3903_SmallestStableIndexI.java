/**
 * Problem: Smallest Stable Index I
 * Difficulty: Easy
 * Pattern: Array, Prefix/Suffix, Preprocessing
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/smallest-stable-index-i/
 */
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] maxValue=new int[nums.length];
        int[] minValue=new int[nums.length];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            maxValue[i]=max;
            min=Math.min(nums[nums.length-1-i],min);
            minValue[nums.length-1-i]=min;
        }
        for(int i=0;i<nums.length;i++){
            if(maxValue[i]-minValue[i]<=k){
                return i;
            }
        }
        return -1;
    }
}