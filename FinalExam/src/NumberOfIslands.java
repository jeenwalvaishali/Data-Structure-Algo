public class NumberOfIslands {

    public int numberOfIslands(char[][] grid){

        int m = grid.length;
        int n = grid[0].length;

        int numOfIslands = 0;

        for (int i =0; i<m; i++){
            for(int j=0; j<n; j++){
                if (grid[i][j] == '1'){
                    markIsland(grid, i, j);
                    numOfIslands++;
                }
            }
        }

        return numOfIslands;
    }

    private void markIsland(char[][] grid, int i, int j) {

        if (i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j] == '0'){
            return;
        }

        grid[i][j] = '0';

        markIsland(grid, i+1, j);
        markIsland(grid, i-1, j);
        markIsland(grid, i, j+1);
        markIsland(grid, i, j-1);
    }
}

/*
* Time Complexity:O(m*n)
* Space Complexity:O(mn)
*
* */
