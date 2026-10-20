/**
 * Problem: Sum of Sortable Integers (#3886)
 * Difficulty: Medium
 * Pattern: Array
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/sum-of-sortable-integers/
 */

class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for (int k = 1; k <= n; k++) {
            if (n % k != 0) {
                continue;
            }

            if (k == 1) {
                boolean sorted = true;

                for (int i = 1; i < n; i++) {
                    if (nums[i - 1] > nums[i]) {
                        sorted = false;
                        break;
                    }
                }

                if (sorted) {
                    sum += k;
                }
                continue;
            }

            boolean sortable = true;

            for (int start = 0; start < n; start += k) {
                int decreases = 0;

                for (int j = 0; j < k; j++) {
                    int current = start + j;
                    int next = start + (j + 1) % k;

                    if (nums[current] > nums[next]) {
                        decreases++;
                    }
                }

                if (decreases > 1) {
                    sortable = false;
                    break;
                }
            }

            if (sortable) {
                sum += k;
            }
        }

        return sum;

    }
}
