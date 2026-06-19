/*
Problem: 1. Two Sum
Difficulty: Easy
Pattern: HashMap
Time Complexity: O(N)
Space Complexity: O(N)
Core Idea: Store each number with its index in a hashmap. For every element,
           check if the complement (target - nums[i]) already exists.
*/

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (hm.containsKey(complement)) {
                return new int[]{hm.get(complement), i};
            }

            hm.put(nums[i], i);
        }

        return new int[]{};
    }
}