/**
 * Problem: Number Of Ways To Assign Edge Weights I I (#3559)
 * Difficulty: Hard
 * Pattern: DFS+Math
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/number-of-ways-to-assign-edge-weights-i-i/
 */
import java.util.ArrayList;
import java.util.List;

public class NumberOfWaysToAssignEdgeWeightsII {
    private static final int MOD = 1_000_000_007;
    private List<List<Integer>> adj;
    private int[] depth;
    private int[] parent;
    private int[] up; // binary lifting table (simplified: just parent array for O(n) LCA)
    // For O(n log n) LCA we use binary lifting
    private int[][] anc;
    private int LOG;
    private int n;

    public long[] assignEdgeWeights(int[][] edges, int[][] queries) {
        n = edges.length + 1;
        LOG = 1;
        while ((1 << LOG) <= n) LOG++;

        adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) adj.add(new ArrayList<>());
        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        depth = new int[n + 1];
        parent = new int[n + 1];
        anc = new int[n + 1][LOG];
        dfs(1, 0, 0);

        // Build binary lifting table
        for (int i = 1; i <= n; i++) anc[i][0] = parent[i];
        for (int j = 1; j < LOG; j++) {
            for (int i = 1; i <= n; i++) {
                anc[i][j] = anc[anc[i][j - 1]][j - 1];
            }
        }

        // Precompute powers of 2
        long[] pow2 = new long[n + 1];
        pow2[0] = 1;
        for (int i = 1; i <= n; i++) pow2[i] = pow2[i - 1] * 2 % MOD;

        long[] result = new long[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int u = queries[i][0], v = queries[i][1];
            int lca = lca(u, v);
            int edgesOnPath = depth[u] + depth[v] - 2 * depth[lca];
            result[i] = edgesOnPath == 0 ? 0 : pow2[edgesOnPath - 1];
        }
        return result;
    }

    private void dfs(int node, int par, int d) {
        depth[node] = d;
        parent[node] = par == 0 ? node : par;
        for (int nb : adj.get(node)) {
            if (nb != par) dfs(nb, node, d + 1);
        }
    }

    private int lca(int u, int v) {
        if (depth[u] < depth[v]) { int tmp = u; u = v; v = tmp; }
        int diff = depth[u] - depth[v];
        for (int j = 0; j < LOG; j++) {
            if (((diff >> j) & 1) == 1) u = anc[u][j];
        }
        if (u == v) return u;
        for (int j = LOG - 1; j >= 0; j--) {
            if (anc[u][j] != anc[v][j]) {
                u = anc[u][j];
                v = anc[v][j];
            }
        }
        return anc[u][0];
    }
}
