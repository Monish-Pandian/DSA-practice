/**
 * Problem: Rank Transform of an Array (#1331)
 * Difficulty: Easy
 * Pattern: Array, Sorting, HashMap
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/rank-transform-of-an-array/
 */

import java.util.*;
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = arr.clone();

        Arrays.sort(sorted);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        for (int num : sorted) {
            if (!map.containsKey(num)) {
                map.put(num, rank++);
            }
        }

        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ans[i] = map.get(arr[i]);
        }

        return ans;
    }
}