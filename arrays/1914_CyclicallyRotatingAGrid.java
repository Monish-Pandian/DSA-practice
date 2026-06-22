import java.util.*;

/**
 * Problem: Cyclically Rotating A Grid (#1914)
 * Difficulty: Med.
 * Pattern: Simulation
 * Time Complexity: O(n*m)
 * Space Complexity: O(n*m)
 * LeetCode: https://leetcode.com/problems/cyclically-rotating-a-grid/
 */
public class CyclicallyRotatingAGrid {
    public int[][] rotateGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        for (int layer = 0; layer < Math.min(m,n)/2; layer++) {
            List<Integer> ring = new ArrayList<>();
            int r1=layer, c1=layer, r2=m-1-layer, c2=n-1-layer;
            for (int c=c1;c<=c2;c++) ring.add(grid[r1][c]);
            for (int r=r1+1;r<=r2;r++) ring.add(grid[r][c2]);
            for (int c=c2-1;c>=c1;c--) ring.add(grid[r2][c]);
            for (int r=r2-1;r>r1;r--) ring.add(grid[r][c1]);
            int sz=ring.size(), rot=k%sz;
            List<Integer> rotated = new ArrayList<>();
            for (int i=rot;i<sz;i++) rotated.add(ring.get(i));
            for (int i=0;i<rot;i++) rotated.add(ring.get(i));
            int idx=0;
            for (int c=c1;c<=c2;c++) grid[r1][c]=rotated.get(idx++);
            for (int r=r1+1;r<=r2;r++) grid[r][c2]=rotated.get(idx++);
            for (int c=c2-1;c>=c1;c--) grid[r2][c]=rotated.get(idx++);
            for (int r=r2-1;r>r1;r--) grid[r][c1]=rotated.get(idx++);
        }
        return grid;
    }
}
