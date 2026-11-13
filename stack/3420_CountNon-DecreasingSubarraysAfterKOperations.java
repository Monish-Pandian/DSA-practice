/**
 * Problem: Count Non-Decreasing Subarrays After K Operations (#3420)
 * Difficulty: Medium
 * Pattern: Stack
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/count-non-decreasing-subarrays-after-k-operations/
 */

import java.util.*;
class Solution {
    public long countNonDecreasingSubarrays(int[] nums, int k) {

        int n = nums.length;

        long ans = 0;
        long cost = 0;

        int j = n - 1;

        Deque<int[]> dq = new ArrayDeque<>();

        for (int i = n - 1; i >= 0; i--) {

            int num = nums[i];
            int count = 1;

            while (!dq.isEmpty() && dq.peekLast()[0] < num) {

                int[] last = dq.pollLast();

                int oldValue = last[0];
                int oldCount = last[1];

                count += oldCount;

                cost += (long) (num - oldValue) * oldCount;
            }

            dq.offerLast(new int[]{num, count});

            while (cost > k) {

                int[] first = dq.pollFirst();

                int rightmostValue = first[0];
                int rightmostCount = first[1];

                cost -= rightmostValue - nums[j];

                j--;

                if (rightmostCount > 1) {
                    dq.offerFirst(
                        new int[]{rightmostValue, rightmostCount - 1}
                    );
                }
            }

            ans += j - i + 1;
        }

        return ans;
    }
}
