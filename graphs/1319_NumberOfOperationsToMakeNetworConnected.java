/**
 * Problem: Number of Operations to Make Network Connected (#1319)
 * Difficulty: Medium
 * Pattern: Graph, Union Find (Disjoint Set Union)
 * Time Complexity: O(n + m · α(n))
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/number-of-operations-to-make-network-connected/
 */

class Solution {
    int[] parent;
    public int makeConnected(int n, int[][] connections) {
        if(connections.length < n - 1)
          return -1;
        parent=new int[n];
        int edges=0;
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        for(int[] edge:connections){
            int u=edge[0];
            int v=edge[1];
            if(find(u)==find(v)){
                edges++;
            }else{
                union(u,v);
            }
        }
        int components=0;
        for(int i=0;i<n;i++){
            if(find(i)==i){
                components++;
            }
        }
        int need=components-1;
        return need<=edges?need:-1;
    }
    private int find(int x){
        if(parent[x]==x){
            return parent[x];
        }
        parent[x]=find(parent[x]);
        return parent[x];
    }
    private void union(int x,int y){
        int rootx=find(x);
        int rooty=find(y);
        if(rootx!=rooty){
            parent[rooty]=rootx;
        }
    }
}