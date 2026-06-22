import java.util.*;

/**
 * Problem: Degree Of An Array (#697)
 * Difficulty: Easy
 * Pattern: HashMap
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/degree-of-an-array/
 */
public class DegreeOfAnArray {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], new int[]{0, i, i});
            int[] d = map.get(nums[i]);
            d[0]++; d[2] = i;
        }
        int deg = 0, res = 0;
        for (int[] d : map.values()) {
            if (d[0] > deg || (d[0] == deg && d[2]-d[1]+1 < res)) {
                deg = d[0]; res = d[2]-d[1]+1;
            }
        }
        return res;
    }
}
