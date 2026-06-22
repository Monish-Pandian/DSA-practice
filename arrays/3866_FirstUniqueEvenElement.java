import java.util.*;

/**
 * Problem: First Unique Even Element (#3866)
 * Difficulty: Easy
 * Pattern: HashMap
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/first-unique-even-element/
 */
public class FirstUniqueEvenElement {
    public int firstUniqueEvenElement(int[] nums) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int n : nums) if (n%2 == 0) map.merge(n, 1, Integer::sum);
        for (Map.Entry<Integer, Integer> e : map.entrySet()) if (e.getValue() == 1) return e.getKey();
        return -1;
    }
}
