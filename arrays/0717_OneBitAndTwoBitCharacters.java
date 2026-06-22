/**
 * Problem: One Bit And Two Bit Characters (#717)
 * Difficulty: Easy
 * Pattern: Greedy
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/1-bit-and-2-bit-characters/
 */
public class OneBitAndTwoBitCharacters {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) i += bits[i] == 1 ? 2 : 1;
        return i == bits.length - 1;
    }
}
