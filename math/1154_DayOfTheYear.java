/**
 * Problem: Day Of The Year (#1154)
 * Difficulty: Easy
 * Pattern: Simulation
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/day-of-the-year/
 */
public class DayOfTheYear {
    public int dayOfYear(String date) {
        int year  = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day   = Integer.parseInt(date.substring(8, 10));
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (isLeap(year)) days[1] = 29;
        int total = day;
        for (int i = 0; i < month - 1; i++) total += days[i];
        return total;
    }
    private boolean isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
    }
}
