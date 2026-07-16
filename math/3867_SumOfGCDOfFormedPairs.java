/**
 * Problem: Sum of GCD of Formed Pairs (#3867)
 * Difficulty: Medium
 * Pattern: Math, GCD, Prefix Maximum
 * Time Complexity: O(n log M + n log n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/sum-of-gcd-of-formed-pairs/
 */

import java.util.*;
class Solution {
    public long gcdSum(int[] nums) {
        int[] prefixGcd=new int[nums.length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
             max=Math.max(max,nums[i]);
             prefixGcd[i]=gcd(nums[i],max);
        }
        Arrays.sort(prefixGcd);
        long sum=0;
        for(int i=0;i<nums.length/2;i++){
           sum+=gcd(prefixGcd[i],prefixGcd[nums.length-1-i]);
        }
        return sum;
    }
    private int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}