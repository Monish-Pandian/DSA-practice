import java.util.*;

/**
 * Problem: Block Placement Queries (#3161)
 * Difficulty: Hard
 * Pattern: BinarySearch + TreeMap
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/block-placement-queries/
 */
public class BlockPlacementQueries {
    public List<Boolean> getResults(int[][] queries) {
        TreeMap<Integer, Integer> gaps = new TreeMap<>();
        // obstacles set: key=position, value=gap to previous obstacle
        TreeMap<Integer, Integer> obstacles = new TreeMap<>();
        obstacles.put(0, 0);
        // maxGap[x] = max gap among all obstacles with position <= x
        TreeMap<Integer, Integer> maxGap = new TreeMap<>();
        maxGap.put(0, 0);

        List<Boolean> res = new ArrayList<>();
        for (int[] q : queries) {
            if (q[0] == 1) {
                // Add obstacle at position q[1]
                int pos = q[1];
                int lo = obstacles.floorKey(pos);
                int hi = obstacles.ceilingKey(pos) == null ? Integer.MAX_VALUE : obstacles.ceilingKey(pos);
                obstacles.put(pos, pos - lo);
                if (hi != Integer.MAX_VALUE) obstacles.put(hi, hi - pos);
                // Update maxGap from pos onwards
                int prevMax = maxGap.floorEntry(lo).getValue();
                maxGap.put(pos, Math.max(prevMax, pos - lo));
            } else {
                // Query: can we place block of size q[2] at position <= q[1]?
                int pos = q[1], size = q[2];
                int lastObs = obstacles.floorKey(pos);
                int gapToLast = pos - lastObs;
                int maxSoFar = maxGap.floorEntry(lastObs).getValue();
                res.add(Math.max(maxSoFar, gapToLast) >= size);
            }
        }
        return res;
    }
}
