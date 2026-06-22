/**
 * Problem: Lemonade Change (#860)
 * Difficulty: Easy
 * Pattern: Greedy
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/lemonade-change/
 */
public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for (int b : bills) {
            if (b == 5) five++;
            else if (b == 10) { if (five == 0) return false; five--; ten++; }
            else {
                if (ten > 0 && five > 0) { ten--; five--; }
                else if (five >= 3) five -= 3;
                else return false;
            }
        }
        return true;
    }
}
