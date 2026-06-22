import java.util.*;

/**
 * Problem: Earliest Finish Time For Land And Water Rides II (#3635)
 * Difficulty: Med.
 * Pattern: DP + BinarySearch
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/earliest-finish-time-for-land-and-water-rides-ii/
 */
public class EarliestFinishTimeForLandAndWaterRidesII {
    public long earliestFinishTime(int[][] rides) {
        Arrays.sort(rides, (a, b) -> a[1] - b[1]);
        int n = rides.length;
        long[] dp = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i-1]; // skip this ride
            int start = rides[i-1][0], end = rides[i-1][1];
            // Binary search: find last ride that ends <= start
            int lo = 0, hi = i - 1;
            while (lo < hi) {
                int mid = (lo + hi + 1) / 2;
                if (rides[mid-1][1] <= start) lo = mid; else hi = mid - 1;
            }
            dp[i] = Math.max(dp[i], dp[lo] + (end - start));
        }
        return dp[n];
    }
}
