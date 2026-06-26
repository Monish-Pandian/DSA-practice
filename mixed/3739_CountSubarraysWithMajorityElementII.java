/*
* Problem: Count Subarrays With Majority Element II (#3739)
* Difficulty: Hard 
* Pattern: Prefix Sum, Fenwick Tree (Binary Indexed Tree) 
* Time Complexity: O(n log n) 
* Space Complexity: O(n) 
* LeetCode: https://leetcode.com/problems/count-subarrays-with-majority-element-ii/
*/

class Solution {

    class Fenwick {
        int[] bit;
        int n;

        Fenwick(int n) {
            this.n = n;
            bit = new int[n + 2];
        }

        void update(int idx, int val) {
            while (idx <= n) {
                bit[idx] += val;
                idx += idx & -idx;
            }
        }

        int query(int idx) {
            int sum = 0;
            while (idx > 0) {
                sum += bit[idx];
                idx -= idx & -idx;
            }
            return sum;
        }
    }

    public long countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;

        int size = 2 * n + 3;
        int offset = n + 1;

        Fenwick ft = new Fenwick(size);

        long ans = 0;
        int balance = 0;

        ft.update(offset, 1);

        for (int num : nums) {

            if (num == target)
                balance++;
            else
                balance--;

            int idx = balance + offset;

            ans += ft.query(idx - 1);

            ft.update(idx, 1);
        }

        return ans;
    }
}