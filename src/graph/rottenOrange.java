package graph;

import java.util.*;

class Triplet {
    int row;
    int col;
    int time;
    Triplet(int row,int col,int time){
        this.row = row;
        this.col = col;
        this.time = time;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean [][] visited = new boolean [n][m];
        Queue<Triplet> q = new LinkedList<>();
        int min = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if( grid[i][j] == 2){
                    q.add(new Triplet(i,j,0));
                }
            }
        }

        while(!q.isEmpty()){
            Triplet top = q.remove();
            int row = top.row, col = top.col, time = top.time;
            min = Math.max(min,time);
            if( col !=0 && grid[row][col-1] == 1 ){
                q.add(new Triplet(row,col-1,time+1));
                grid[row][col-1] = 2;
            }
            if( row !=0 && grid[row-1][col] == 1  ){
                q.add(new Triplet(row-1,col,time+1));
                grid[row-1][col] = 2;
            }
            if( col != grid[0].length-1 && grid[row][col+1] == 1 ){
                grid[row][col+1] = 2;
                q.add(new Triplet(row,col+1,time+1));

            }
            if( row != grid.length-1 && grid[row+1][col] == 1  ){
                q.add(new Triplet(row+1,col,time+1));
                grid[row+1][col] = 2;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if( grid[i][j] == 1){
                    return -1;
                }
            }
        }
        return min;
    }

}