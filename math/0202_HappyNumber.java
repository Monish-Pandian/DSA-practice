/**
 * Problem: Happy Number (#202)
 * Difficulty: Easy
 * Pattern: Math, HashSet, Cycle Detection
 * Time Complexity: O(log n) per transformation
 * Space Complexity: O(log n)
 * LeetCode: https://leetcode.com/problems/happy-number/
 */

import java.util.*;
class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while (n != 1) {

            if (set.contains(n)) {
                return false;
            }

            set.add(n);

            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            n = sum;
        }

        return true;
    }
}