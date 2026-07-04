/**
 * Problem: Find if Path Exists in Graph (#1971)
 * Difficulty: Easy
 * Pattern: Graph, DFS
 * Time Complexity: O(V + E)
 * Space Complexity: O(V + E)
 * LeetCode: https://leetcode.com/problems/find-if-path-exists-in-graph/
 */

import java.util.*;
public class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }
        for(int[] i:edges){
            l.get(i[0]).add(i[1]);
            l.get(i[1]).add(i[0]);
        }
        boolean[] visited=new boolean[n];
        return dfs(source,destination,visited,l);
    }
    public boolean dfs(int node,int destination ,boolean[] visited,List<List<Integer>>l){
        if(node==destination){
            return true;
        }
         visited[node]=true;

         for(int i:l.get(node)){
            if(!visited[i]){
               if(dfs(i,destination,visited,l)){
                return true;
               }
            }
         }
         return false;
    }
} {
    
}
