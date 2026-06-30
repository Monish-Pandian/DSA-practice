/**
 * Problem: Number of Substrings Containing All Three Characters (#1358)
 * Difficulty: Medium
 * Pattern: Sliding Window (Two Pointers, Frequency Counting)
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/
 */

class Solution {
    public int numberOfSubstrings(String s) {
        int[] freq=new int[3];
        int count=0;
        int left=0;
        int n=s.length();
        for(int right=0;right<n;right++){
           freq[s.charAt(right)-'a']++;
           while(freq[0]>0 &&freq[1]>0 && freq[2]>0){
               count+=n-right;
               freq[s.charAt(left)-'a']--;
               left++;
           }
        }
        return count;
    }
}