package graph;

import java.util.*;
class isBipartite {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int [] arr = new int [n];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                if(!bfs(q,i,arr,graph)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean bfs (Queue<Integer> q,int num,int [] arr,int[][] graph){
        q.add(num);
        arr[num] = 1;
        while(!q.isEmpty()){
            int top = q.remove();
            for(int i=0;i<graph[top].length;i++){
                if(arr[graph[top][i]] == 0){
                    q.add(graph[top][i]);
                    if(arr[top] == 1) arr[graph[top][i]] = 2;// red
                    else arr[graph[top][i]] = 1; // green
                }
                else if(arr[graph[top][i]] == arr[top]){
                    return false;
                }
            }
        }
        return true;
    }
}