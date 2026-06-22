import java.util.*;

/**
 * Problem: Intersection Of Two Arrays II (#350)
 * Difficulty: Easy
 * Pattern: HashMap
 * Time Complexity: O(n+m)
 * Space Complexity: O(min(n,m))
 * LeetCode: https://leetcode.com/problems/intersection-of-two-arrays-ii/
 */
public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums1) map.merge(n, 1, Integer::sum);
        List<Integer> res = new ArrayList<>();
        for (int n : nums2)
            if (map.getOrDefault(n, 0) > 0) { res.add(n); map.merge(n, -1, Integer::sum); }
        return res.stream().mapToInt(i -> i).toArray();
    }
}
