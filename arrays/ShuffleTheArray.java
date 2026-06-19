/*
Problem: 1470. Shuffle the Array
Pattern: Index Manipulation
Difficulty: Easy
Time Complexity: O(N)
Space Complexity: O(N)
Core Idea: Traverse both halves simultaneously and place elements alternately as x1,y1,x2,y2,... in the result array.
*/class Solution { 
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int j = 0;

        for(int i = 0; i < n; i++){
            arr[j++] = nums[i];
            arr[j++] = nums[i+n];
        }

        return arr;
    }
}