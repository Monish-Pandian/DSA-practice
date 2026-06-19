/*
Problem: 628. Maximum Product of Three Numbers
Pattern: Math / Greedy
Difficulty: Easy
Time Complexity: O(N)
Space Complexity: O(1)
Core Idea: Track the three largest numbers and two smallest numbers. The maximum product is either the product of the three largest numbers or the product of the two smallest (negative) numbers and the largest number.
*/
class Solution {
    public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max3 = max2;
                max2 = n;
            } else if (n > max3) {
                max3 = n;
            }

            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min2 = n;
            }
        }

        return Math.max(max1 * max2 * max3, max1 * min1 * min2);
    }
}
