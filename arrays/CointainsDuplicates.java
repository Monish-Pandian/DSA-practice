/*
Problem: 217. Contains Duplicate
Pattern: HashSet
Difficulty: Easy
Time Complexity: O(N)
Space Complexity: O(N)
Core Idea: If element already exists in set, duplicate found.
*/
import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;    // duplicate found immediately
            }
            set.add(num);
        }
        return false;
    }
}
