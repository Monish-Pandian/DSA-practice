/**
 * Problem: Robot Return To Origin (#657)
 * Difficulty: Easy
 * Pattern: Simulation
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/robot-return-to-origin/
 */
public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'U') y++; else if (c == 'D') y--;
            else if (c == 'L') x--; else x++;
        }
        return x == 0 && y == 0;
    }
}
