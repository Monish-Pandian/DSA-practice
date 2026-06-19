/*
Problem: 977. Squares of a Sorted Array
Pattern: Two Pointers
Difficulty: Easy
Time Complexity: O(N)
Space Complexity: O(N)
Core Idea: Use two pointers at both ends, compare absolute values, and place the larger square at the end of the result array.
*/
class Solution { 
    public int[] sortedSquares(int[] nums) {
       int[] result=new int[nums.length];
       int left=0, right=nums.length-1, index=nums.length-1;
       while(left<=right){
        int leftsqr=nums[left]*nums[left];
        int rightsqr=nums[right]*nums[right];
        if(leftsqr>rightsqr){
            result[index--]=leftsqr;
            left++;
        }else{
            result[index--]=rightsqr;
            right--;
        }

       }
       return result;
    }
}