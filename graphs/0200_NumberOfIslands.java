/**
 * Problem: Number of Islands (#200)
 * Difficulty: Medium
 * Pattern: Graph, DFS, Flood Fill
 * Time Complexity: O(m × n)
 * Space Complexity: O(m × n)
 * LeetCode: https://leetcode.com/problems/number-of-islands/
 */

class Solution {
    int count=0;
    int[] dr = {-1, 1, 0, 0};
    int[] dc = {0, 0, -1, 1};
    public int numIslands(char[][] grid) {
        boolean visited[][]=new boolean[grid.length][grid[0].length];
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[0].length;col++){
                if(!visited[row][col] &&grid[row][col]=='1'){
                 dfs(row,col,grid,visited);
                 count++;
            }
            }
          
              
        }
        return count;
    }
    public void dfs(int row,int col,char[][]grid,boolean[][]visited){
        visited[row][col]=true;
        for(int i=0;i<4;i++){
            int newrow=row+dr[i];
            int newcol=col+dc[i];
         if(newrow>=0 &&newrow<grid.length && newcol>=0 && newcol<grid[0].length){
             if(!visited[newrow][newcol]&& grid[newrow][newcol]=='1'){
                dfs(newrow,newcol,grid,visited);
            }
         }
           
        }

    }


}