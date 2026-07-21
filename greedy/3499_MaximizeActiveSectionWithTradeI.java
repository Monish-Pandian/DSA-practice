/**
 * Problem: Maximize Active Sections After Trade (#3903)
 * Difficulty: Medium
 * Pattern: Greedy, Run Length Encoding (RLE)
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/maximize-active-section-after-trade/
 */


import java.util.*;
class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        String t = "1" + s + "1";
        int n = t.length();

        int initialOnes = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') initialOnes++;
        }

        List<Character> chars = new ArrayList<>();
        List<Integer> lens = new ArrayList<>();

        int i = 0;
        while (i < n) {
            char ch = t.charAt(i);
            int j = i;
            while (j < n && t.charAt(j) == ch) {
                j++;
            }
            chars.add(ch);
            lens.add(j - i);
            i = j;
        }

        int maxGain = 0;

        for (i = 1; i < chars.size() - 1; i++) {
            if (chars.get(i) == '1'
                    && chars.get(i - 1) == '0'
                    && chars.get(i + 1) == '0') {

                int gain = lens.get(i - 1) + lens.get(i + 1);
                maxGain = Math.max(maxGain, gain);
            }
        }

        return initialOnes + maxGain;
    }
}