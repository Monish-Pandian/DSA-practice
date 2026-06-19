/*
Problem: 1732. Find the Highest Altitude
Pattern: Prefix Sum
Difficulty: Easy
Time Complexity: O(N)
Space Complexity: O(1)
Core Idea: Maintain a running altitude using prefix sums and track the maximum altitude reached.
*/

class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int sum = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            sum += gain[i];
            max = Math.max(max, sum);
        }

        return max;
    }
}