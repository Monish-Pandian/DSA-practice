import java.util.*;

/**
 * Problem: Minimum Index Sum Of Two Lists (#599)
 * Difficulty: Easy
 * Pattern: HashMap
 * Time Complexity: O(n+m)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/minimum-index-sum-of-two-lists/
 */
public class MinimumIndexSumOfTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) map.put(list1[i], i);
        List<String> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                int sum = j + map.get(list2[j]);
                if (sum < min) { min = sum; res.clear(); res.add(list2[j]); }
                else if (sum == min) res.add(list2[j]);
            }
        }
        return res.toArray(new String[0]);
    }
}
