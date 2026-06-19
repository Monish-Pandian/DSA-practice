/*
Problem: 896. Monotonic Array
Pattern: Linear Scan
Difficulty: Easy
Time Complexity: O(N)
Space Complexity: O(1)
Core Idea: Traverse once while tracking whether the array can remain non-decreasing or non-increasing. If either condition holds, the array is monotonic.
*/
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true;
        boolean dec = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                dec = false;
            }
            if (nums[i] < nums[i - 1]) {
                inc = false;
            }
        }

        return inc || dec;
    }
}
