/**
 * Problem: Max Product of Two Digits (#3550)
 * Difficulty: Easy
 * Pattern: Math, Digit Manipulation
 * Time Complexity: O(log₁₀n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/maximum-product-of-two-digits/
 */
class Solution {
    public int maxProduct(int n) {
         int largest=-1;
         int secondLargest=-1;
         while(n>0){
            int digit=n%10;
            if(digit>largest){
                secondLargest=largest;
                largest=digit;
            }else if(digit>secondLargest){
                secondLargest=digit;
            }
            n/=10;
         }
         return secondLargest*largest;
    }
}