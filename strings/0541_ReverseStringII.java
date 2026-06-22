/**
 * Problem: Reverse String II (#541)
 * Difficulty: Easy
 * Pattern: TwoPointers
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/reverse-string-ii/
 */
public class ReverseStringII {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i += 2*k) {
            int l = i, r = Math.min(i + k - 1, arr.length - 1);
            while (l < r) { char t = arr[l]; arr[l++] = arr[r]; arr[r--] = t; }
        }
        return new String(arr);
    }
}
