import java.util.*;

/**
 * Problem: Contains Duplicate II (#219)
 * Difficulty: Easy
 * Pattern: SlidingWindow+HashSet
 * Time Complexity: O(n)
 * Space Complexity: O(k)
 * LeetCode: https://leetcode.com/problems/contains-duplicate-ii/
 */
public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) return true;
            map.put(nums[i], i);
        }
        return false;
    }
}
