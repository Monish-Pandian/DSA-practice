/*
Problem: 2161. Partition Array According to Pivot
Pattern: Array Partitioning
Difficulty: Medium
Time Complexity: O(N)
Space Complexity: O(N)
Core Idea: Traverse the array three times to place elements less than, equal to, and greater than the pivot while preserving relative order.
*/

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] ans = new int[n];

        int idx = 0;

      
        for (int num : nums) {
            if (num < pivot) {
                ans[idx++] = num;
            }
        }

       
        for (int num : nums) {
            if (num == pivot) {
                ans[idx++] = num;
            }
        }

      
        for (int num : nums) {
            if (num > pivot) {
                ans[idx++] = num;
            }
        }

        return ans;
    }
}