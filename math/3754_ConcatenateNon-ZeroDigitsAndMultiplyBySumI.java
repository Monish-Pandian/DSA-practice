/**
 * Problem: Rotting Oranges (#994)
 * Difficulty: Medium
 * Pattern: Graph, Multi-Source BFS
 * Time Complexity: O(m × n)
 * Space Complexity: O(m × n)
 * LeetCode: https://leetcode.com/problems/rotting-oranges/
 */

class Solution {
    public long sumAndMultiply(int n) {
        int digit;
        int  place=1;
        long sum=0;long x=0;
        while(n>0){
            digit=n%10;
            if(digit!=0){
                sum+=digit;
                x+=digit*place;
                place*=10;
            }
            n/=10;
        }
        return sum*x;
    }
}