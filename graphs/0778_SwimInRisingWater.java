/**
 * Problem: Swim in Rising Water (#778)
 * Difficulty: Hard
 * Pattern: Graph, Dijkstra's Algorithm, Priority Queue
 * Time Complexity: O(mn log(mn))
 * Space Complexity: O(mn)
 * LeetCode: https://leetcode.com/problems/swim-in-rising-water/
 */
import java.util.*;
class Solution {
    public int swimInWater(int[][] grid) {
        int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
        int m=grid.length;
        int n=grid[0].length;
        int[][] dist=new int[m][n];
        for(int[] arr:dist){
            Arrays.fill(arr,Integer.MAX_VALUE);
        }
        dist[0][0]=grid[0][0];
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        pq.offer(new int[]{grid[0][0],0,0});
        while(!pq.isEmpty()){
            int[] cur=pq.poll();
            int curTime=cur[0];
            int row=cur[1];
            int col=cur[2];
            if(row==m-1 && col==n-1){
                return curTime;
            }
            for(int i=0;i<4;i++){
                int newRow=row+dir[i][0];
                int newCol=col+dir[i][1];
                if(newRow<0 ||newRow>m-1||newCol<0||newCol>n-1){
                    continue;
                }
                int time=Math.max(curTime,grid[newRow][newCol]);
                if(time<dist[newRow][newCol]){
                    dist[newRow][newCol]=time;
                    pq.offer(new int[]{time,newRow,newCol});
                }
            }
        }
        return -1;

    }
}