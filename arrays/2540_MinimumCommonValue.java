/**
 * Problem: Minimum Common Value (#2540)
 * Difficulty: Easy
 * Pattern: TwoPointers
 * Time Complexity: O(n+m)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/minimum-common-value/
 */
public class MinimumCommonValue {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) return nums1[i];
            else if (nums1[i] < nums2[j]) i++; else j++;
        }
        return -1;
    }
}
