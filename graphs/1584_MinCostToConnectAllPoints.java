/**
 * Problem: Min Cost to Connect All Points (#1584)
 * Difficulty: Medium
 * Pattern: Graph, Minimum Spanning Tree, Kruskal, Union Find
 * Time Complexity: O(n² log n)
 * Space Complexity: O(n²)
 * LeetCode: https://leetcode.com/problems/min-cost-to-connect-all-points/
 */

import java.util.*;
class Solution {
    int[] parent;int[]rank;
    public int minCostConnectPoints(int[][] points) {
        List<int[]> l=new ArrayList<>();
        parent=new int[points.length];
        rank=new int[points.length];
        for(int i=0;i<points.length;i++){
            parent[i]=i;
            rank[i]=0;
        }

        for(int i=0;i<points.length;i++){
            for(int j=i+1;j<points.length;j++){
                int cost=Math.abs(points[j][0]-points[i][0])+Math.abs(points[j][1]-points[i][1]);
                l.add(new int[]{i,j,cost});
            }
        }
        l.sort((a,b)->Integer.compare(a[2],b[2]));
        int totalcost=0;
        int selected=0;
        for(int[] arr:l){
            int u=arr[0];
            int v=arr[1];
            int cost=arr[2];
            if(find(u)!=find(v)){
                union(u,v);
                totalcost+=cost;
                selected++;
            }
            if(selected==points.length-1)break;
        }
        return totalcost;
    }
    private int find(int x){
        if(parent[x]==x)return parent[x];
        parent[x]=find(parent[x]);
        return parent[x];
    }
    private void union(int x,int y){
        int rootX=find(x);
        int rootY=find(y);
        if(rootX==rootY)return;
           if (rank[rootX] < rank[rootY]) {
            parent[rootX] = rootY;
        }
        else if (rank[rootX] > rank[rootY]) {
            parent[rootY] = rootX;
        }
        else {
            parent[rootY] = rootX;
            rank[rootX]++;
         }
    }
    
}