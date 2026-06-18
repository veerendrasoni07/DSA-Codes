package graph;

import java.util.*;
class Pair {
    int row;int col;

    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

class  numberOfEnclaves {
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        Queue<Pair> q = new LinkedList<>();
        // first col
        for (int i = 1; i < n; i++) {
            if (grid[i][0] == 1) {
                q.add(new Pair(i,0));
                visited[i][0] = true;
            }
        }
        // first row
        for (int j = 0; j < m - 1; j++) {
            if (grid[0][j] == 1) {
                q.add(new Pair(0,j));
                visited[0][j] = true;
            }
        }
        // last col
        for (int k = 0; k < n - 1; k++) {
            if (grid[k][m - 1] == 1) {
                visited[k][m - 1] = true;
                q.add(new Pair(k,m - 1));
            }
        }
        // last row
        for (int l = 1; l < m; l++) {
            if (grid[n-1][l] == 1) {
                visited[n-1][l] = true;
                q.add(new Pair(n-1,l));
            }
        }
        while (!q.isEmpty()) {
            Pair p = q.remove();
            int row = p.row, col = p.col;
            if (col != 0 && grid[row][col - 1] == 1 && !visited[row][col - 1]) {
                q.add(new Pair(row, col - 1));
                visited[row][col - 1] = true;
            }
            if (row != 0 && grid[row - 1][col] == 1 &&  !visited[row - 1][col]) {
                q.add(new Pair(row - 1, col));
                visited[row - 1][col] = true;
            }
            if (col != grid[0].length - 1 && grid[row][col + 1] == 1 && !visited[row][col + 1]) {
                visited[row][col + 1] = true;
                q.add(new Pair(row, col + 1));

            }
            if (row != grid.length - 1 && grid[row + 1][col] == 1 && !visited[row + 1][col]) {
                q.add(new Pair(row + 1, col));
                visited[row + 1][col] = true;
            }
        }
        int enclaves = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] == false && grid[i][j]==1) {
                    enclaves++;
                }
            }
        }
        return enclaves;

    }
}