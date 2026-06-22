/**
 * Problem: Largest Perimeter Triangle (#976)
 * Difficulty: Easy
 * Pattern: Greedy+Sorting
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/largest-perimeter-triangle/
 */
import java.util.Arrays;
public class LargestPerimeterTriangle {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i-2] + nums[i-1] > nums[i])
                return nums[i-2] + nums[i-1] + nums[i];
        }
        return 0;
    }
}
