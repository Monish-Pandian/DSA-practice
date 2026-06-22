import java.util.*;

/**
 * Problem: Next Greater Element II (#503)
 * Difficulty: Med.
 * Pattern: MonotonicStack
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/next-greater-element-ii/
 */
public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < 2 * n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n])
                res[stack.pop()] = nums[i % n];
            if (i < n) stack.push(i);
        }
        return res;
    }
}
