/*
Problem: 2657. Find the Prefix Common Array of Two Arrays
Pattern: Frequency Counting
Difficulty: Medium
Time Complexity: O(N)
Space Complexity: O(N)
Core Idea: Track elements seen in both arrays using a boolean array. Whenever an element is encountered for the second time across the prefixes, increment the common count.
*/
public class PrefixCommonArray {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        
        int n = A.length;
        int[] ans = new int[n];
        
        boolean[] seen = new boolean[n + 1];
        int common = 0;
        
        for (int i = 0; i < n; i++) {
            
            if (seen[A[i]]) {
                common++;
            } else {
                seen[A[i]] = true;
            }
            
            if (seen[B[i]]) {
                common++;
            } else {
                seen[B[i]] = true;
            }
            
            ans[i] = common;
        }
        
        return ans;
    }
} 