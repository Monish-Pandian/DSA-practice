/**
 * Problem: Top K Frequent Elements (#347)
 * Difficulty: Medium
 * Pattern: HashMap, Heap (Priority Queue)
 * Time Complexity: O(n log k)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/top-k-frequent-elements/
 */

import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        int[] arr=new int[k];
        for(int i:nums){
          hm.merge(i,1,Integer::sum);
        }
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            pq.offer(entry);
            if(pq.size()>k){
                pq.poll();
            }
           
        }
       int i=0;
       while(!pq.isEmpty()){
          arr[i++]=pq.poll().getKey();
       }
        return arr;
    }
}