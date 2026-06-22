import java.util.*;

/**
 * Problem: Third Maximum Number (#414)
 * Difficulty: Easy
 * Pattern: TreeSet
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/third-maximum-number/
 */
public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int n : nums) { set.add(n); if (set.size() > 3) set.pollFirst(); }
        return set.size() == 3 ? set.first() : set.last();
    }
}
