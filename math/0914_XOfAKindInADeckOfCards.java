/**
 * Problem: X Of A Kind In A Deck Of Cards (#914)
 * Difficulty: Easy
 * Pattern: GCD
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/
 */
import java.util.*;
public class XOfAKindInADeckOfCards {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int card : deck) count.merge(card, 1, Integer::sum);
        int g = 0;
        for (int v : count.values()) g = gcd(g, v);
        return g >= 2;
    }
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
