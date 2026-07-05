/**
 * Problem: Max Area of Island (#695)
 * Difficulty: Medium
 * Pattern: Graph, DFS, Flood Fill
 * Time Complexity: O(m × n)
 * Space Complexity: O(m × n)
 * LeetCode: https://leetcode.com/problems/max-area-of-island/
 */

class Solution {
    int max=0;
    int[] dr={-1,1,0,0};
    int[] dc={0,0,1,-1};
    public int maxAreaOfIsland(int[][] grid) {
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[0].length;col++){
                if(grid[row][col]==1){
                    int area=dfs(row,col,grid);
                    max=Math.max(max,area);
                }
            }
        }
        return max;
    }
    public int dfs(int row,int col, int[][]grid){
        
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]==0) return 0;
        grid[row][col]=0;
        int area=1;
        for(int i=0;i<4;i++){
            area+=dfs(row+dr[i],col+dc[i],grid);
        }
        return area;
    }
}