/*
Problem: 605. Can Place Flowers
Difficulty: Easy
Pattern: Greedy
Time Complexity: O(N)
Space Complexity: O(1)
Core Idea: Traverse the flowerbed and greedily plant a flower whenever both
           adjacent plots (if they exist) are empty.
*/
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       for(int i=0;i<flowerbed.length;i++){
        if(flowerbed[i]==0){
            boolean left=i==0||flowerbed[i-1]==0;
            boolean right=i==flowerbed.length-1||flowerbed[i+1]==0;
            if(left&&right){
                flowerbed[i]=1;
                n--;
                if(n==0){return true;}
        }
        }
        
       }
       return n<=0;
    }
}