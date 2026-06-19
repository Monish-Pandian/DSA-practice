/*
Problem: 268. Missing Number
Pattern: XOR
Difficulty: Easy
Time Complexity: O(N)
Space Complexity: O(1)
Core Idea: XOR all indices and array values together. Equal numbers cancel out, leaving only the missing number.
*/
class Solution {
    public int missingNumber(int[] nums) {
        int xor = nums.length;

        for (int i = 0; i < nums.length; i++) {
            xor ^= i ^ nums[i];
        }

        return xor;
    }
}