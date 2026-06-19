/*
Problem: 1089. Duplicate Zeros
Difficulty: Easy
Pattern: Two Pointers / Array Simulation
Time Complexity: O(N)
Space Complexity: O(1)
Core Idea: Count zeros first, then use two pointers from the end to
           copy elements backwards while duplicating zeros in-place.
*/
class Solution {
    public void duplicateZeros(int[] arr) {
        int zeros=0;
        int n=arr.length;
        for(int i:arr){
            if(i==0)zeros++;
        }
        int i=n-1;
        int j=n+zeros-1;
        while(i<j){
            if(j<n){
                arr[j]=arr[i];
            }
            if(arr[i]==0){
                j--;
                if(j<n){
                    arr[j]=0;
                }
            }
            i--;
            j--;
        }
    }
}