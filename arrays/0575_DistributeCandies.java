import java.util.*;

/**
 * Problem: Distribute Candies (#575)
 * Difficulty: Easy
 * Pattern: HashSet
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/distribute-candies/
 */
public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int c : candyType) set.add(c);
        return Math.min(set.size(), candyType.length / 2);
    }
}
