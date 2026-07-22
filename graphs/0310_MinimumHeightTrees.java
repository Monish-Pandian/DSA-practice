/**
 * Problem: Minimum Height Trees (#310)
 * Difficulty: Medium
 * Pattern: Graph, Topological BFS
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/minimum-height-trees/
 */
import java.util.*;
class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> result=new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        if (n == 1)
    return Arrays.asList(0);
        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }
        int[] degree=new int[n];
        for(int[] edge:edges){
             int u=edge[0];
             int v=edge[1];
             l.get(u).add(v);
             l.get(v).add(u);
             degree[u]++;
             degree[v]++;
  }
        for(int i=0;i<n;i++){
            if(degree[i]==1){
                q.offer(i);
            }
        }
        int remainingNodes = n;
        while(remainingNodes>2){
            int size=q.size();
            for(int i=0;i<size;i++){
                int node=q.poll();
                for(int nei:l.get(node)){
                    degree[nei]--;
                    if(degree[nei]==1){
                        q.offer(nei);
                    }
                }
            }
            remainingNodes -= size;
        }
        while(!q.isEmpty()){
            result.add(q.poll());
        }
        return result;
    }
}