/**
 * Problem: Number of Provinces (#547)
 * Difficulty: Medium
 * Pattern: Graph, DFS, Connected Components
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/number-of-provinces/
 */

class Solution {
    int count=0;
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited=new boolean[isConnected.length];
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]){
              dfs(i,isConnected,visited);
              count++;
            }
        }
        return count;
        
    }
    public void dfs(int node,int[][] isConnected,boolean[]visited){
        visited[node]=true;
        for(int nei=0;nei<isConnected.length;nei++){
            if(!visited[nei]){
                if(isConnected[node][nei]==1){
                    dfs(nei,isConnected,visited);
                }
            }
        }

    }
}