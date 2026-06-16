package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    public static void main(String[] args) {
        // Graph - Adjacency Matrix
        int [][] mat = new int[6][6];
        mat[0][2] = 1;
        mat[0][3] = 1;
        mat[0][5] = 1;
        mat[1][4] = 1;
        mat[1][5] = 1;
        mat[2][0] = 1;
        mat[3][0] = 1;
        mat[4][1] = 1;
        mat[5][0] = 1;
        mat[5][1] = 1;
        boolean [] visited = new boolean[6];
        ArrayList<Integer> ans = new ArrayList<>();
        bfsTraversal(mat,visited,ans);
        for(int n : ans){
            System.out.print(n + " ");
        }
    }

    private static void bfsTraversal(int[][] mat, boolean[] visited, ArrayList<Integer> ans) {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0] = true;
        while(!q.isEmpty()){
            int front = q.remove();
            ans.add(front);
            for(int i=0;i<mat.length;i++){
                if( mat[front][i] == 1 && !visited[i]){
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }

}
