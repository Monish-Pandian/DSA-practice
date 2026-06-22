/**
 * Problem: Binary Prefix Divisible By 5 (#1018)
 * Difficulty: Easy
 * Pattern: BitManipulation
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/binary-prefix-divisible-by5/
 */
import java.util.*;
public class BinaryPrefixDivisibleBy5 {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>();
        int cur = 0;
        for (int num : nums) {
            cur = (cur * 2 + num) % 5;
            result.add(cur == 0);
        }
        return result;
    }
}
