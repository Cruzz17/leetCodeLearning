package temp;

/*
created by cwy on 2019.03.05
给定一个由 '1'（陆地）和 '0'（水）组成的的二维网格，计算岛屿的数量。一个岛被水包围，并且它是通过水平方向或垂直方向上相邻的陆地连接而成的。你可以假设网格的四个边均被水包围。

示例 1:

输入:
11110
11010
11000
00000

输出: 1
示例 2:

输入:
11000
11000
00100
00011

输出: 3
 */
public class Demo200 {
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i =0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    private int dfs(char[][] gird,int x,int y){
        if(x<0||x>gird.length||y<0||y>gird[0].length||gird[x][y]==0)
            return 0;
        gird[x][y]=0;
        return 1+dfs(gird,x+1,y)+dfs(gird,x-1,y)+dfs(gird,x,y+1)+dfs(gird,x,y-1);
    }

    public static void main(String[] args) {
        Demo200 demo200=new Demo200();
        char[][] arr={{'1','1','1','0','0'},{'1','1','0','0','0'},{'0','1','1','0','0'},{'1','1','0','0','0'}};
        System.out.println(demo200.numIslands(arr));
    }
}
