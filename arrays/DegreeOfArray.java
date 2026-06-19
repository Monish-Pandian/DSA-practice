/*
Problem: 697. Degree of an Array
Pattern: HashMap
Difficulty: Easy
Time Complexity: O(N)
Space Complexity: O(N)
Core Idea: Track each number's first occurrence and frequency. For numbers with the maximum frequency (degree), compute the smallest subarray length.
*/
import java.util.*;
class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        HashMap<Integer,Integer> hm1=new HashMap<>();
        int degree=0,minlen=nums.length;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            hm.putIfAbsent(num, i);

            hm1.put(num,hm1.getOrDefault(num,0)+1);
            if (hm1.get(num) > degree) {
                degree = hm1.get(num);
                minlen = i - hm.get(num) + 1;
            }
            else if(degree==hm1.get(num)){
                minlen=Math.min(minlen,i-hm.get(num)+1);
            }
        }
        return minlen;
    }
}