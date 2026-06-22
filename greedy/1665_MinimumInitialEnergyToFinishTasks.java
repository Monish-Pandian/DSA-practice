import java.util.*;

/**
 * Problem: Minimum Initial Energy To Finish Tasks (#1665)
 * Difficulty: Hard
 * Pattern: Greedy + Sorting
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/minimum-initial-energy-to-finish-tasks/
 */
public class MinimumInitialEnergyToFinishTasks {
    public int minimumEffort(int[][] tasks) {
        // Sort by (minimum - actual) descending: tasks with bigger buffer go last
        Arrays.sort(tasks, (a, b) -> (b[1] - b[0]) - (a[1] - a[0]));
        int energy = 0, minEnergy = 0;
        for (int[] t : tasks) {
            minEnergy = Math.max(minEnergy, energy + t[1]);
            energy += t[0];
        }
        return minEnergy;
    }
}
