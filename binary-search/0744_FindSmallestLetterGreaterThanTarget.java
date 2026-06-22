/**
 * Problem: Find Smallest Letter Greater Than Target (#744)
 * Difficulty: Easy
 * Pattern: BinarySearch
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 */
public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0, r = letters.length;
        while (l < r) {
            int mid = (l + r) / 2;
            if (letters[mid] <= target) l = mid + 1; else r = mid;
        }
        return letters[l % letters.length];
    }
}
