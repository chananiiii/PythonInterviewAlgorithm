package org.example;

class _200 {
    public static int [][] check;
    public int numIslands(char[][] grid) {
        int result = 0;
        check = new int[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[i].length; j++) {
                if(grid[i][j] == '1' && check[i][j] == 0) {
                    result ++;
                    search(grid, i, j);
                }
            }
        }
        return result;
    }

    public static void search(char [][] grid, int y, int x) {
        // upside
        if(y < 0) {
            return;
        }
        // downside
        if(y >= check.length) {
            return;
        }
        // leftside
        if(x < 0) {
            return;
        }
        // rightside
        if(x >= check[y].length) {
            return;
        }

        if(check[y][x] == 1 || grid[y][x] == '0' ) {
            return;
        }

        // check visited
        check[y][x] = 1;

        search(grid, y, x-1);
        search(grid, y, x+1);
        search(grid, y-1, x);
        search(grid, y+1, x);
    }
}