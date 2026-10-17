/**
 * Problem: Minimum Swaps to Sort by Digit Sum (#3551)
 * Difficulty: Medium
 * Pattern: Array, Hash Map
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/minimum-swaps-to-sort-by-digit-sum/
 */

import java.util.*;
class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            int temp = nums[i];
            int sum = 0;

            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            arr[i][0] = sum;
            arr[i][1] = nums[i];
        }
        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });
        Map<Integer, Integer> target = new HashMap<>();

        for (int i = 0; i < n; i++) {
            target.put(arr[i][1], i);
        }

        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || target.get(nums[i]) == i) {
                continue;
            }

            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = target.get(nums[j]);
                cycleSize++;
            }

            swaps += cycleSize - 1;
        }

        return swaps;
    }
}
