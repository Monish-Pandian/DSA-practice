/**
 * Problem: Student Attendance Record I (#551)
 * Difficulty: Easy
 * Pattern: Traversal
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/student-attendance-record-i/
 */
public class StudentAttendanceRecordI {
    public boolean checkRecord(String s) {
        int absent = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A' && ++absent > 1) return false;
            if (i >= 2 && s.charAt(i) == 'L' && s.charAt(i-1) == 'L' && s.charAt(i-2) == 'L') return false;
        }
        return true;
    }
}
