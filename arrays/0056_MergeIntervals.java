/**
 * Problem: Merge Intervals (#56)
 * Difficulty: Medium
 * Pattern: Sorting, Intervals
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/merge-intervals/
 */

import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> l=new ArrayList<>();
        int start =intervals[0][0];
        int end=intervals[0][1];

        for(int j=1;j<intervals.length;j++){
          if(end>=intervals[j][0]){
            end=Math.max(end,intervals[j][1]);
            start=Math.min(start,intervals[j][0]);
          }else{
            l.add(new int[]{start,end});
            start=intervals[j][0];
            end=intervals[j][1];
          }
        }
        l.add(new int[]{start,end});
        return l.toArray(new int[l.size()][]);
    }
}