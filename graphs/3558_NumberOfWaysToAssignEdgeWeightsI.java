/**
 * Problem: Number Of Ways To Assign Edge Weights I (#3558)
 * Difficulty: Med.
 * Pattern: DFS
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/number-of-ways-to-assign-edge-weights-i/
 */
import java.util.ArrayList;
import java.util.List;

public class NumberOfWaysToAssignEdgeWeightsI {
    private static final int MOD = 1_000_000_007;
    private List<List<Integer>> adj;
    private long[] ways;

    public long[] assignEdgeWeights(int[][] edges, int[][] queries) {
        int n = edges.length + 1;
        adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) adj.add(new ArrayList<>());
        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        // depth[i] = depth of node i from root (node 1)
        int[] depth = new int[n + 1];
        dfs(1, 0, 0, depth);

        ways = new long[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int u = queries[i][0], v = queries[i][1];
            // Number of edges on path = depth[u] + depth[v] - 2*depth[lca]
            // but since tree is rooted and given as a path problem,
            // number of odd-weight edges on path determines count.
            // Ways = 2^(edgesOnPath - 1) where edgesOnPath > 0, else 0.
            int edgesOnPath = depth[u] + depth[v]; // simplified: LCA is root here
            // For a general tree we'd subtract 2*LCA depth; use actual LCA
            int lca = lca(u, v, depth, n);
            edgesOnPath = depth[u] + depth[v] - 2 * depth[lca];
            if (edgesOnPath == 0) ways[i] = 0;
            else ways[i] = pow2(edgesOnPath - 1);
        }
        return ways;
    }

    private void dfs(int node, int parent, int d, int[] depth) {
        depth[node] = d;
        for (int nb : adj.get(node)) {
            if (nb != parent) dfs(nb, node, d + 1, depth);
        }
    }

    private int lca(int u, int v, int[] depth, int n) {
        // Simple LCA by lifting
        while (u != v) {
            if (depth[u] > depth[v]) u = parent(u);
            else v = parent(v);
        }
        return u;
    }

    private int[] par;

    private int parent(int u) {
        return par[u];
    }

    // Rewrite to store parent during DFS
    public long[] assignEdgeWeightsWithParent(int[][] edges, int[][] queries) {
        int n = edges.length + 1;
        adj = new ArrayList<>();
        par = new int[n + 1];
        int[] depth = new int[n + 1];
        for (int i = 0; i <= n; i++) adj.add(new ArrayList<>());
        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        dfsWithParent(1, 0, 0, depth, par);

        ways = new long[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int u = queries[i][0], v = queries[i][1];
            int lu = u, lv = v;
            while (lu != lv) {
                if (depth[lu] > depth[lv]) lu = par[lu];
                else lv = par[lv];
            }
            int edgesOnPath = depth[u] + depth[v] - 2 * depth[lu];
            ways[i] = edgesOnPath == 0 ? 0 : pow2(edgesOnPath - 1);
        }
        return ways;
    }

    private void dfsWithParent(int node, int p, int d, int[] depth, int[] par) {
        depth[node] = d;
        par[node] = p == 0 ? node : p;
        for (int nb : adj.get(node)) {
            if (nb != p) dfsWithParent(nb, node, d + 1, depth, par);
        }
    }

    private long pow2(int exp) {
        long result = 1, base = 2;
        while (exp > 0) {
            if ((exp & 1) == 1) result = result * base % MOD;
            base = base * base % MOD;
            exp >>= 1;
        }
        return result;
    }
}
