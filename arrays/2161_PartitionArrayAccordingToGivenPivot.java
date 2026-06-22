import java.util.*;

/**
 * Problem: Partition Array According To Given Pivot (#2161)
 * Difficulty: Med.
 * Pattern: TwoPointers
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/partition-array-according-to-given-pivot/
 */
public class PartitionArrayAccordingToGivenPivot {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less = new ArrayList<>(), eq = new ArrayList<>(), greater = new ArrayList<>();
        for (int n : nums) {
            if (n < pivot) less.add(n);
            else if (n == pivot) eq.add(n);
            else greater.add(n);
        }
        int i = 0;
        for (int v : less) nums[i++] = v;
        for (int v : eq) nums[i++] = v;
        for (int v : greater) nums[i++] = v;
        return nums;
    }
}
