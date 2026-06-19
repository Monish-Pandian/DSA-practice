/*
Problem: 905. Sort Array By Parity
Pattern: Two Pointers
Difficulty: Easy
Time Complexity: O(N)
Space Complexity: O(1)
Core Idea: Use two pointers from both ends. Swap when an odd number is on the left and an even number is on the right, placing all even numbers before odd numbers.
*/
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int first=0;
        int last=nums.length-1;
        while(first<last){
            if((nums[first]&1)==1 && (nums[last]&1)==0){
                int temp=nums[first];
                nums[first]=nums[last];
                nums[last]=temp;
                first++;last--;
            }
            else if(nums[first]%2==0){
                first++;
            }else{
                last--;
            }
        }
        return nums;
    }
}