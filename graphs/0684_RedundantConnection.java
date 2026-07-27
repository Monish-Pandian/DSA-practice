/**
 * Problem: Redundant Connection (#684)
 * Difficulty: Medium
 * Pattern: Graph, Union Find (Disjoint Set Union)
 * Time Complexity: O(n · α(n))
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/redundant-connection/
 */

class Solution {
    int[] parent;
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        parent=new int[n+1];
        for(int i=1;i<n+1;i++){
            parent[i]=i;
        }
        for(int i=0;i<n;i++){
            int rootx=find(edges[i][0]);
            int rooty=find(edges[i][1]);
            if(rootx==rooty){
               return new int[]{edges[i][0],edges[i][1]};
            }else{
                union(edges[i][0],edges[i][1]);
            }
        }
          
          
        return new int[0];
    }
    private int find(int x){
        if(parent[x]==x)return parent[x];

        parent[x]=find(parent[x]);
        return parent[x];
     }

     private void union(int x, int y){
    int rootX = find(x);
    int rootY = find(y);

    if(rootX != rootY){
        parent[rootY] = rootX;
    }
}
}