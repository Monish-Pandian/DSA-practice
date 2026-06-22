/**
 * Problem: Angle Between Hands Of Clock (#1344)
 * Difficulty: Med.
 * Pattern: Math
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/angle-between-hands-of-clock/
 */
public class AngleBetweenHandsOfClock {
    public double angleClock(int hour, int minutes) {
        double hourAngle   = (hour % 12) * 30 + minutes * 0.5;
        double minuteAngle = minutes * 6;
        double diff = Math.abs(hourAngle - minuteAngle);
        return Math.min(diff, 360 - diff);
    }
}
