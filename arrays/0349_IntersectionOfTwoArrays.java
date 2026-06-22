import java.util.*;

/**
 * Problem: Intersection Of Two Arrays (#349)
 * Difficulty: Easy
 * Pattern: HashSet
 * Time Complexity: O(n+m)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/intersection-of-two-arrays/
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums1) set.add(n);
        Set<Integer> res = new HashSet<>();
        for (int n : nums2) if (set.contains(n)) res.add(n);
        return res.stream().mapToInt(i -> i).toArray();
    }
}
