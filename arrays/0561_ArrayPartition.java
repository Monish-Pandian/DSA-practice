import java.util.*;

/**
 * Problem: Array Partition (#561)
 * Difficulty: Easy
 * Pattern: Sorting
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/array-partition/
 */
public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) sum += nums[i];
        return sum;
    }
}
