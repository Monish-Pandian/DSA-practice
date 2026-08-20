/**
 * Problem: Distribute Elements Into Two Arrays I (#3072)
 * Difficulty: Medium
 * Pattern: Array, Simulation
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * LeetCode: https://leetcode.com/problems/distribute-elements-into-two-arrays-i/
 */
import java.util.*;
class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        Arrays.fill(arr1,-1);
        Arrays.fill(arr2,-1);
        arr1[0]=nums[0];
        arr2[0]=nums[1];int k=0;int j=0;
        for(int i=2;i<n;i++){
           if(arr1[k]>arr2[j]){
            arr1[++k]=nums[i];
           }else if(arr1[k]<arr2[j]){
            arr2[++j]=nums[i];
           }
        }
        k=0;
        for(int i=0;i<n;i++){
            if(arr1[i]>0){
                nums[k++]=arr1[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr2[i]>0){
                nums[k++]=arr2[i];
            }
        }
        return nums;
    }
}