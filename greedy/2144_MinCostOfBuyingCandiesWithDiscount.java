import java.util.*;

/**
 * Problem: Minimum Cost Of Buying Candies With Discount (#2144)
 * Difficulty: Easy
 * Pattern: Greedy + Sorting
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/
 */
public class MinCostOfBuyingCandiesWithDiscount {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int total = 0;
        // Buy most expensive first; every 3rd item (cheapest of each group) is free
        for (int i = cost.length - 1; i >= 0; i--)
            if ((cost.length - i) % 3 != 0) total += cost[i];
        return total;
    }
}
