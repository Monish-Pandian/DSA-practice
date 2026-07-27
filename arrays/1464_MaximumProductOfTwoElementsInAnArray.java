/**
 * Problem: Maximum Product of Two Elements in an Array (#1464)
 * Difficulty: Easy
 * Pattern: Array, Greedy
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * LeetCode: https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
 */

class Solution {
    public int maxProduct(int[] nums) {
        int largest=-1;
        int secondLargest=-1;
        for(int i:nums){
            if(i>largest){               
                secondLargest=largest;
                largest=i;
            }
            else if(i>secondLargest){
                secondLargest=i;
            }
        }
        return (largest-1)*(secondLargest-1);
    }
}