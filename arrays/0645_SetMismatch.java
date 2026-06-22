import java.util.*;

/**
 * Problem: Set Mismatch (#645)
 * Difficulty: Easy
 * Pattern: HashMap
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/set-mismatch/
 */
public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) map.merge(n, 1, Integer::sum);
        int dup = 0, missing = 0;
        for (int i = 1; i <= nums.length; i++) {
            if (map.getOrDefault(i, 0) == 2) dup = i;
            if (!map.containsKey(i)) missing = i;
        }
        return new int[]{dup, missing};
    }
}
