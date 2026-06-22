/**
 * Problem: Combine Two Tables (#175)
 * Difficulty: Easy
 * Pattern: SQL
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/combine-two-tables/
 */
# Write your MySQL query statement below
SELECT 
  person.firstName,
  person.lastName,
  address.city,
  address.state
  FROM person LEFT JOIN address ON person.personId=address.personId;
