package dfs;

public class Demo200 {
    public int numIslands(char[][] grid) {
        int count =0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(dfs(i,j,grid))
                    count++;
            }
        }
        return count;
    }

    public boolean dfs(int i, int j, char[][] grid){
        if(i<0||i>grid.length||j<0||j>grid[0].length)
            return false;
        if(grid[i][j]=='0'){
            return false;
        }
        else if(grid[i][j]=='1'){
            grid[i][j]='0';
            dfs(i+1,j,grid);
            dfs(i-1,j,grid);
            dfs(i,j+1,grid);
            dfs(i,j-1,grid);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        char [][] d = {{'1','0','1'},{'0','1','1'},{'1','1','1'}};

        Demo200 demo200 = new Demo200();
        System.out.println(demo200.numIslands(d));
    }
}
