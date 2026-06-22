import java.util.*;

/**
 * Problem: Find All Numbers Disappeared (#448)
 * Difficulty: Easy
 * Pattern: InPlaceMarking
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 */
public class FindAllNumbersDisappeared {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int n : nums) { int idx = Math.abs(n)-1; if (nums[idx] > 0) nums[idx] = -nums[idx]; }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) if (nums[i] > 0) res.add(i+1);
        return res;
    }
}
