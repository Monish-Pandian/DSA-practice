import java.util.*;

/**
 * Problem: N Repeated Element In Size 2N Array (#961)
 * Difficulty: Easy
 * Pattern: HashSet
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 */
public class NRepeatedElementInSize2NArray {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int n : nums) if (!seen.add(n)) return n;
        return -1;
    }
}
