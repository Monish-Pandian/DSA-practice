import java.util.*;

/**
 * Problem: Three Sum Closest (#16)
 * Difficulty: Med.
 * Pattern: TwoPointers
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/3sum-closest/
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i+1, r = nums.length-1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (Math.abs(sum - target) < Math.abs(closest - target)) closest = sum;
                if (sum < target) l++; else if (sum > target) r--; else return sum;
            }
        }
        return closest;
    }
}
