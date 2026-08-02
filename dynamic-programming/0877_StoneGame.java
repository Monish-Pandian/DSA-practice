/**
 * Problem: Stone Game (#877)
 * Difficulty: Medium
 * Pattern: Game Theory, Math
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/stone-game/
 *
 * Key Insight:
 * The number of piles is even, so Alice can always choose a strategy
 * that guarantees her control over either all even-indexed or all
 * odd-indexed piles.
 *
 * Since the total number of stones is odd, the sums of the two groups
 * cannot be equal. One group must contain more stones than the other.
 *
 * Alice can force the game to give her the group with the larger sum.
 * Therefore, Alice always wins when both players play optimally.
 *
 * Hence, we can simply return true.
 */
class Solution {
    public boolean stoneGame(int[] piles) {
        return true;
    }
}