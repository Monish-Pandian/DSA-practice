/**
 * Problem: Find Prefix Common Array Of Two Arrays (#2657)
 * Difficulty: Med.
 * Pattern: BitMask
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/
 */
public class FindPrefixCommonArrayOfTwoArrays {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] res = new int[n], freq = new int[n+1];
        int common = 0;
        for (int i = 0; i < n; i++) {
            if (++freq[A[i]] == 2) common++;
            if (++freq[B[i]] == 2) common++;
            res[i] = common;
        }
        return res;
    }
}
