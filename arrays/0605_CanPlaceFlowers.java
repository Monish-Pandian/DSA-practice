/**
 * Problem: Can Place Flowers (#605)
 * Difficulty: Easy
 * Pattern: Greedy
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/can-place-flowers/
 */
public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length && n > 0; i++) {
            if (flowerbed[i] == 0
                && (i == 0 || flowerbed[i-1] == 0)
                && (i == flowerbed.length-1 || flowerbed[i+1] == 0)) {
                flowerbed[i] = 1; n--;
            }
        }
        return n == 0;
    }
}
