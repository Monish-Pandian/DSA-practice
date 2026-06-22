import java.util.*;

/**
 * Problem: Unique Email Addresses (#929)
 * Difficulty: Easy
 * Pattern: HashSet
 * Time Complexity: O(n*m)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/unique-email-addresses/
 */
public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            String[] parts = email.split("@");
            String local = parts[0].split("\\+")[0].replace(".", "");
            set.add(local + "@" + parts[1]);
        }
        return set.size();
    }
}
