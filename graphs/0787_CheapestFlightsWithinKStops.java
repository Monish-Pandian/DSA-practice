/**
 * Problem: Cheapest Flights Within K Stops (#787)
 * Difficulty: Medium
 * Pattern: Graph, Dijkstra's Algorithm, Shortest Path, Priority Queue
 * Time Complexity: O(E × K log(V × K))
 * Space Complexity: O(V × K + E)
 * LeetCode: https://leetcode.com/problems/cheapest-flights-within-k-stops/
 */
import java.util.*;
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<int[]>> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }
        for(int[]edge:flights){
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];
            l.get(u).add(new int[]{v,w});
        }
        int[][] dist = new int[n][k + 2];

        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        dist[src][0] = 0;

        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        pq.offer(new int[]{0, src, 0});

        while (!pq.isEmpty()) {

            int[] edge = pq.poll();

            int cost = edge[0];
            int node = edge[1];
            int step = edge[2];

            if (node == dst) {
                return cost;
            }

            if (step == k + 1) {
                continue;
            }

            for (int[] nei : l.get(node)) {

                int nextNode = nei[0];
                int price = nei[1];

                int newCost = cost + price;
                int newStep = step + 1;

                if (newCost < dist[nextNode][newStep]) {

                    dist[nextNode][newStep] = newCost;

                    pq.offer(new int[]{newCost,nextNode,newStep});
                }
            }
        }return -1;

    }
}