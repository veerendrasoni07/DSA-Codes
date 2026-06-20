package graph;


import java.util.*;


class distOfNearestCellHaving1 {
    private class Triplet{
        int row;
        int col;
        int dist;
        Triplet(int row,int col, int dist){
            this.row = row;
            this.col = col;
            this.dist = dist;
        }
    }
    public ArrayList<ArrayList<Integer>> nearest(int[][] grid) {
        // code here
        int n = grid.length;
        int m = grid[0].length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Queue<Triplet> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    grid[i][j] = -1;
                    q.add(new Triplet(i,j,0));
                }
            }
        }
        while(!q.isEmpty()){
            Triplet t = q.remove();
            int row = t.row,col = t.col, dist = t.dist;
            if (col != 0 && grid[row][col - 1] == 0) {
                q.add(new Triplet(row, col - 1,dist+1));

                grid[row][col-1] = dist+1;

            }
            if (row != 0 && grid[row - 1][col] == 0) {
                q.add(new Triplet(row - 1, col,dist+1));
                grid[row-1][col] = dist+1;
            }
            if (col != grid[0].length - 1 && grid[row][col + 1] == 0) {
                q.add(new Triplet(row, col + 1,dist+1));
                grid[row][col+1] = dist+1;

            }
            if (row != grid.length - 1 && grid[row + 1][col] == 0) {
                q.add(new Triplet(row + 1, col,dist+1));
                grid[row+1][col] = dist+1;

            }
        }
        for(int i=0;i<n;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0;j<m;j++){
                if(grid[i][j]==-1){
                    temp.add(0);

                }
                else temp.add(grid[i][j]);
            }
            ans.add(temp);
        }
        return ans;
    }
}