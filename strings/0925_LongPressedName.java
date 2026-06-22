/**
 * Problem: Long Pressed Name (#925)
 * Difficulty: Easy
 * Pattern: TwoPointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/long-pressed-name/
 */
public class LongPressedName {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) { i++; j++; }
            else if (j > 0 && typed.charAt(j) == typed.charAt(j-1)) j++;
            else return false;
        }
        return i == name.length();
    }
}
