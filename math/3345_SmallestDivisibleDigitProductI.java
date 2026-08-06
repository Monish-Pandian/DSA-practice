/**
 * Problem: Smallest Number With Divisible Digit Product I (#3345)
 * Difficulty: Easy
 * Pattern: Math, Digit Manipulation
 * Time Complexity: O(d · k)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/smallest-divisible-digit-product-i/
 */

class Solution {
    public int smallestNumber(int n, int t) {
        while(true){           
            int temp=n;
            int product=1;
            if (temp == 0) {
                product = 0;
            }
            while(temp>0){
                product*=temp%10;
                temp/=10;
            }
            if(product%t==0)return n;
            n++;
        }
        
    }
}