import java.util.*;

/**
 * Problem: Roman To Integer (#13)
 * Difficulty: Easy
 * Pattern: HashMap
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/roman-to-integer/
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of('I',1,'V',5,'X',10,'L',50,'C',100,'D',500,'M',1000);
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = map.get(s.charAt(i));
            if (i+1 < s.length() && val < map.get(s.charAt(i+1))) res -= val;
            else res += val;
        }
        return res;
    }
}
