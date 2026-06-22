/**
 * Problem: Reverse Only Letters (#917)
 * Difficulty: Easy
 * Pattern: TwoPointers
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/reverse-only-letters/
 */
public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int l = 0, r = arr.length - 1;
        while (l < r) {
            while (l < r && !Character.isLetter(arr[l])) l++;
            while (l < r && !Character.isLetter(arr[r])) r--;
            if (l < r) { char t = arr[l]; arr[l++] = arr[r]; arr[r--] = t; }
        }
        return new String(arr);
    }
}
