/**
 * Problem: Course Schedule II (#210)
 * Difficulty: Medium
 * Pattern: Graph, DFS, Topological Sort
 * Time Complexity: O(V + E)
 * Space Complexity: O(V + E)
 * LeetCode: https://leetcode.com/problems/course-schedule-ii/
 */

import java.util.*;
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> l=new ArrayList<>();
        int n=numCourses;
        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }
        for(int[] i:prerequisites){
            l.get(i[1]).add(i[0]);
        }
        boolean[] pathvisited=new boolean[n];
        boolean[] visited=new boolean[n];
        
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<n;i++){
              if(!visited[i]){
                if(dfs(i,l,visited,pathvisited,result)){
                    return new int[0];
                }
              }
        }
        Collections.reverse(result);
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=result.get(i);
        }
        return arr;
    }

    public boolean dfs(int node,List<List<Integer>> l,boolean[] visited,boolean[] pathvisited,List<Integer> result){
        visited[node]=true;
        pathvisited[node]=true;

        for(int i:l.get(node)){
            if(!visited[i]){
                if(dfs(i,l,visited,pathvisited,result))
                return true;
            }
            else if(pathvisited[i]){
                return true;
            }
        }
        pathvisited[node]=false;
        result.add(node);

        return false;
    }
}