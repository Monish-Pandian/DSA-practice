/**
 * Problem: Minimum Moves To Make Array Complementary (#1674)
 * Difficulty: Med.
 * Pattern: PrefixSum
 * Time Complexity: O(n+k)
 * Space Complexity: O(k)
 * LeetCode: https://leetcode.com/problems/minimum-moves-to-make-array-complementary/
 */
public class MinimumMovesToMakeArrayComplementary {
    public int minMoves(int[] nums, int limit) {
        int n = nums.length;
        int[] delta = new int[2*limit+2];
        for (int i = 0; i < n/2; i++) {
            int a = nums[i], b = nums[n-1-i];
            int lo = Math.min(a,b)+1, hi = Math.max(a,b)+limit;
            delta[2] += 2;
            delta[lo] -= 1;
            delta[a+b] -= 1;
            delta[a+b+1] += 1;
            delta[hi+1] += 1;
        }
        int res = Integer.MAX_VALUE, cur = 0;
        for (int i = 2; i <= 2*limit; i++) { cur += delta[i]; res = Math.min(res, cur); }
        return res;
    }
}
