/**
 * Problem: Shortest Path in Binary Matrix (#1091)
 * Difficulty: Medium
 * Pattern: Graph, BFS
 * Time Complexity: O(n²)
 * Space Complexity: O(n²)
 * LeetCode: https://leetcode.com/problems/shortest-path-in-binary-matrix/
 */

import java.util.*;
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]==1 || grid[grid.length-1][grid[0].length-1]==1){
            return -1;
        }
        Queue<int[]> q=new LinkedList<>();
        boolean[][] visited= new boolean[grid.length][grid[0].length];
        q.offer(new int[]{0,0});
        visited[0][0]=true;
        int distance=1;
        int[] rd={-1,1,-1,1,-1,1,0,0};
        int[] cd={-1,1,1,-1,0,0,-1,1};
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] arr=q.poll();
                int row=arr[0];
                int col=arr[1];
                if(row==grid.length-1 && col==grid[0].length-1)return distance;
                for(int j=0;j<8;j++){
                   int newRow=row+rd[j];
                   int newCol=col+cd[j];
                   if(newRow>=0 && newRow<grid.length && newCol >=0 && newCol<grid[0].length &&
                   !visited[newRow][newCol] && grid[newRow][newCol]==0){
                    q.offer(new int[] {newRow,newCol});
                    visited[newRow][newCol]=true;
                   }
                }

            }
                distance++;
            
           
        }
        return -1;
    }
}