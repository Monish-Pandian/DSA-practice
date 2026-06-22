import java.util.*;

/**
 * Problem: Destroying Asteroids (#2126)
 * Difficulty: Med.
 * Pattern: Greedy + Sorting
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/destroying-asteroids/
 */
public class DestroyingAsteroids {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long m = mass;
        for (int a : asteroids) {
            if (m < a) return false;
            m += a;
        }
        return true;
    }
}
