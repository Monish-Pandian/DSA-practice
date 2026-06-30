/**
 * Problem: Last Stone Weight (#1046)
 * Difficulty: Easy
 * Pattern: Max Heap (Priority Queue Simulation)
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/last-stone-weight/
 */

import java.util.*;
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones){
            pq.offer(i);
        }
        while(pq.size()>1){
            int x=pq.poll();
            int y=pq.poll();
            if(x!=y){
                pq.offer(x-y);
            }
        }
        return pq.isEmpty()?0:pq.poll();
    }
}