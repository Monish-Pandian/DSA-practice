import java.util.*;

/**
 * Problem: Fair Candy Swap (#888)
 * Difficulty: Easy
 * Pattern: HashSet+Math
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/fair-candy-swap/
 */
public class FairCandySwap {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
        Set<Integer> setB = new HashSet<>();
        for (int a : aliceSizes) sumA += a;
        for (int b : bobSizes) { sumB += b; setB.add(b); }
        for (int a : aliceSizes) {
            int b = (sumB - sumA) / 2 + a;
            if (setB.contains(b)) return new int[]{a, b};
        }
        return new int[]{};
    }
}
