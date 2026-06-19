/*
Problem: 283. Move Zeroes
Pattern: Two Pointers
Difficulty: Easy
Time Complexity: O(N)
Space Complexity: O(1)
Core Idea: Shift all non-zero elements forward, fill remaining with zeros.
*/
class Solution {
    public void moveZeroes(int[] nums) {
      int j=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            nums[j]=nums[i];
            j++;
        }
      }
      for(int i=j;i<nums.length;i++){
        nums[i]=0;
      }
    }
}