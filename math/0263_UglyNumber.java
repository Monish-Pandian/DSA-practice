/**
 * Problem: Ugly Number (#263)
 * Difficulty: Easy
 * Pattern: Math, Prime Factorization
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/ugly-number/
 */
class Solution {
    public boolean isUgly(int n) {
        if(n==0)return false;
        while(n%2==0)n/=2;
        while(n%3==0)n/=3;
        while(n%5==0)n/=5;

        return n==1;
    }
}