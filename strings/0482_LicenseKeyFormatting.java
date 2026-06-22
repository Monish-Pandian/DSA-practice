/**
 * Problem: License Key Formatting (#482)
 * Difficulty: Easy
 * Pattern: Simulation
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/license-key-formatting/
 */
public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) != '-') {
                if (sb.length() > 0 && sb.length() % (k+1) == k) sb.append('-');
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
        }
        return sb.reverse().toString();
    }
}
