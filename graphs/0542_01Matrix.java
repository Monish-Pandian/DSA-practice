/**
 * Problem: 01 Matrix (#542)
 * Difficulty: Medium
 * Pattern: Graph, Multi-Source BFS
 * Time Complexity: O(m × n)
 * Space Complexity: O(m × n)
 * LeetCode: https://leetcode.com/problems/01-matrix/
 */

import java.util.*;
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[][] result=new int[mat.length][mat[0].length];
        Queue<int[]> q=new LinkedList<>();
        
        boolean[][] visited=new boolean[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){q.offer(new int[]{i,j});
                visited[i][j]=true;}
            }
        }
        int[] rd={1,-1,0,0};
        int[] cd={0,0,1,-1};
        int level=0;
        while(!q.isEmpty()){
            int size=q.size();
            level++;
            for(int i=0;i<size;i++){
                int[] arr=q.poll();
                int row=arr[0];
                int col=arr[1];
                for(int j=0;j<4;j++){
                    int newRow=rd[j]+row;
                    int newCol=cd[j]+col;
                    if(newRow>=0 &&newRow<mat.length && newCol>=0 && newCol<mat[0].length &&!visited[newRow][newCol] ){
                        result[newRow][newCol]=level;
                        q.offer(new int[]{newRow,newCol});
                        visited[newRow][newCol]=true;
                    }
                }
            }
            
        }
        return result;

    }
}