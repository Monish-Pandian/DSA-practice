/**
 * Problem: Network Delay Time (#743)
 * Difficulty: Medium
 * Pattern: Graph, Dijkstra's Algorithm, Shortest Path
 * Time Complexity: O((V + E) log V)
 * Space Complexity: O(V + E)
 * LeetCode: https://leetcode.com/problems/network-delay-time/
 */
import java.util.*;
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> l=new ArrayList<>();
        for(int i=0;i<n+1;i++){
            l.add(new ArrayList<>());
        }
        for(int[] edges:times){
            int u=edges[0];
            int v=edges[1];
            int w=edges[2];
            l.get(u).add(new int[]{v,w});
        }
        int[] dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        PriorityQueue<int[]> pq =
           new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        pq.offer(new int[]{0,k});
        while(!pq.isEmpty()){
            int[] edge=pq.poll();
            int currentweight=edge[0];
            for(int[] nei:l.get(edge[1])){
              int u=nei[0];
              int w=nei[1];
              if(dist[u]>w+currentweight){
                dist[u]=w+currentweight;
                pq.offer(new int[]{dist[u],u});
              }
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i = 1; i <= n; i++){
            if(dist[i] == Integer.MAX_VALUE){
                return -1;
         }

         max = Math.max(max, dist[i]);
     }
     return max;
    }
}