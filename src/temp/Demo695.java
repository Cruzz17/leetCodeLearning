package temp;

/*
created by cwy on 2019.03.04
给定一个包含了一些 0 和 1的非空二维数组 grid , 一个 岛屿 是由四个方向 (水平或垂直) 的 1 (代表土地) 构成的组合。你可以假设二维矩阵的四个边缘都被水包围着。

找到给定的二维数组中最大的岛屿面积。(如果没有岛屿，则返回面积为0。)

示例 1:

[[0,0,1,0,0,0,0,1,0,0,0,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,1,1,0,1,0,0,0,0,0,0,0,0],
 [0,1,0,0,1,1,0,0,1,0,1,0,0],
 [0,1,0,0,1,1,0,0,1,1,1,0,0],
 [0,0,0,0,0,0,0,0,0,0,1,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,0,0,0,0,0,0,1,1,0,0,0,0]]
对于上面这个给定矩阵应返回 6。注意答案不应该是11，因为岛屿只能包含水平或垂直的四个方向的‘1’。

示例 2:

[[0,0,0,0,0,0,0,0]]
对于上面这个给定的矩阵, 返回 0
 */
public class Demo695 {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid.length==0||grid==null)
            return 0;
        int max=0;
        for(int i=0;i<grid.length;++i){
            for(int j=0;j<grid[0].length;++j){
                if(grid[i][j]==1)
                    max= Math.max(max,dfs(grid,i,j));
            }
        }
        return max;
    }
    private int dfs(int[][]gird ,int x,int y){
        if(x<0||x>=gird.length||y<0||y>=gird[0].length||gird[x][y]==0){
            return 0;
        }
        gird[x][y]=0;//每一次访问过后，将其置为0，防止下次再次被访问到。
        return dfs(gird,x+1,y)+dfs(gird,x-1,y)+dfs(gird,x,y+1)+dfs(gird,x,y-1)+1;

    }

    public static void main(String[] args) {
        int[][] arr={{0,1,0},{1,0,0},{1,1,1}};
        Demo695 demo695=new Demo695();
        System.out.println(demo695.maxAreaOfIsland(arr));
    }
}
