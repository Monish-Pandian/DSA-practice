import java.util.*;

/**
 * Problem: Reverse Vowels Of A String (#345)
 * Difficulty: Easy
 * Pattern: TwoPointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/reverse-vowels-of-a-string/
 */
public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        char[] arr = s.toCharArray();
        int l = 0, r = arr.length - 1;
        while (l < r) {
            while (l < r && !vowels.contains(arr[l])) l++;
            while (l < r && !vowels.contains(arr[r])) r--;
            if (l < r) { char t = arr[l]; arr[l++] = arr[r]; arr[r--] = t; }
        }
        return new String(arr);
    }
}
