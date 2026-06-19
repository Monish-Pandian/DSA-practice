/*
Problem: 645. Set Mismatch
Pattern: Array / Index Marking
Difficulty: Easy
Time Complexity: O(N)
Space Complexity: O(1)
Core Idea: Mark visited numbers by negating the value at their corresponding index. A repeated visit reveals the duplicate, and the positive index after traversal reveals the missing number.
*/
class Solution {
    public int[] findErrorNums(int[] nums) {
        int duplicate=-1,missing=-1;
        for(int num:nums){
            int index=Math.abs(num)-1;
            if(nums[index]<0){
                duplicate=Math.abs(num);
            }
            else{
                nums[index]=-nums[index];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                missing=i+1;
            }
        }
        return new int[]{duplicate,missing};
    }
}