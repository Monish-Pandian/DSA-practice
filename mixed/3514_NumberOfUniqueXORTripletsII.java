/**
 * Problem: Unique XOR Triplets II (#3488)
 * Difficulty: Medium
 * Pattern: Bit Manipulation, XOR Enumeration
 * Time Complexity: O(n² + U·n)
 * Space Complexity: O(U)
 * LeetCode: https://leetcode.com/problems/unique-xor-triplets-ii/
 */

class Solution {

    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        int m = 0;
        for (int v : nums) {
            m = Math.max(m, v);
        }
        int u = 1;
        while (u <= m) {
            u <<= 1;
        }
        boolean[] s = new boolean[u];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                s[nums[i] ^ nums[j]] = true;
            }
        }
        boolean[] t = new boolean[u];
        for (int x = 0; x < u; x++) {
            if (!s[x]) {
                continue;
            }
            for (int v : nums) {
                t[x ^ v] = true;
            }
        }
        int ans = 0;
        for (boolean b : t) {
            if (b) {
                ans++;
            }
        }
        return ans;
    }
}