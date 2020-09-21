package everyDay;

import java.util.LinkedList;
import java.util.Queue;

public class Demo12 {
    //沉岛思想

    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int maxValue =0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                maxValue = Math.max(maxValue,dfs(i,j,grid));
            }
        }
        return maxValue;
    }

    public int dfs(int i, int j, int[][] grid){
        if(i<0 || j<0 || i> grid.length || j>grid[0].length || grid[i][j] == 0){
            return 0;
        }
        grid[i][j]=0;
        int up = dfs(i-1,j,grid);
        int down = dfs( i+1,j,grid);
        int left = dfs(i,j-1,grid);
        int right = dfs(i,j+1,grid);
        return up+down+left+right+1;

    }
}
