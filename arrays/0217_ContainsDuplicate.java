import java.util.*;

/**
 * Problem: Contains Duplicate (#217)
 * Difficulty: Easy
 * Pattern: HashSet
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) if (!set.add(n)) return true;
        return false;
    }
}
