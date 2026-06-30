/**
 * Problem: Kth Largest Element in an Array (#215)
 * Difficulty: Medium
 * Pattern: Min Heap (Fixed-size Priority Queue)
 * Time Complexity: O(n log k)
 * Space Complexity: O(k)
 * LeetCode: https://leetcode.com/problems/kth-largest-element-in-an-array/
 */
import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        if(k>nums.length)return 0;
        for(int i:nums){
            pq.offer(i);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}