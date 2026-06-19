/*
Problem: 448. Find All Numbers Disappeared in an Array
Difficulty: Easy
Pattern: Array / Index Marking
Time Complexity: O(N)
Space Complexity: O(1)
Core Idea: Use each number as an index and mark the corresponding position
           as negative. Indices that remain positive represent missing numbers.
*/
import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}
