/**
 * Problem: Rotting Oranges (#994)
 * Difficulty: Medium
 * Pattern: Graph, Multi-Source BFS
 * Time Complexity: O(m × n)
 * Space Complexity: O(m × n)
 * LeetCode: https://leetcode.com/problems/rotting-oranges/
 */
import java.util.*;
class Solution {
    public int orangesRotting(int[][] grid) {
       Queue<int[]> q=new LinkedList<>();
       int fresh=0;
       int min=0;
       boolean rotate=false;
       for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]==2){
                q.offer(new int[]{i,j});
            }else if(grid[i][j]==1){
                fresh++;
            }
        }
       }
       int[] rd={1,-1,0,0};
       int[] cd={0,0,1,-1};
       while(!q.isEmpty()){
        int size=q.size();
            for(int i=0;i<size;i++)
            {
                int[] arr=q.poll();
                int row=arr[0];
                int col=arr[1];
                for(int j=0;j<4;j++)
                {
                   int newRow=row+rd[j];
                   int newCol=col+cd[j];
                   if(newRow>=0 && newRow<grid.length && newCol>=0 && newCol<grid[0].length && grid[newRow][newCol]==1)
                   {
                        grid[newRow][newCol]=2;
                        fresh--;
                        q.offer(new int[]{newRow,newCol});
                        rotate=true;
                   }
                   
                
                }
            }if(rotate){min++;
            rotate=false;}
       }
       if(fresh>0)return -1;
       return min;
    }
}