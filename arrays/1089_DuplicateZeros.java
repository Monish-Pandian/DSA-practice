/**
 * Problem: Duplicate Zeros (#1089)
 * Difficulty: Easy
 * Pattern: TwoPointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/duplicate-zeros/
 */
public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int zeros = 0;
        for (int n : arr) if (n == 0) zeros++;
        int i = arr.length-1, j = arr.length + zeros - 1;
        while (i >= 0) {
            if (arr[i] == 0) {
                if (j < arr.length) arr[j] = 0; j--;
                if (j < arr.length) arr[j] = 0;
            } else if (j < arr.length) arr[j] = arr[i];
            i--; j--;
        }
    }
}
