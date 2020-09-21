package everyDay;

import java.util.LinkedList;
import java.util.Queue;

public class Demo4 {
    public static int result = 0;
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int M = grid.length;
        int N = grid[0].length;

        int count = 0; // count 表示新鲜橘子的数量

        for (int r = 0; r < M; r++) {
            for (int c = 0; c < N ; c++) {
                if(grid[r][c] == 1){
                    count++;
                }else if(grid[r][c] ==2){
                    queue.add(new int[]{r,c});
                }
            }
        }
        int round =0;
        while (count>=0 && !queue.isEmpty()){
            round++;
            int n = queue.size();
            for (int i = 0; i <n ; i++) {
                int[] orange = queue.poll();
                int r= orange[0];
                int c = orange[1];
                if(r-1>=0 && grid[r-1][c]==1){
                    count--;
                    grid[r-1][c]=2;
                    queue.add(new int[]{r-1,c});
                }
                if(r+1<M &&grid[r-1][c] ==1){
                    count--;
                    grid[r+1][c]=2;
                    queue.add(new int[]{r+1,c});
                }
                if(c-1>=0 &&grid[r][c-1]==1){
                    count--;
                    grid[r][c-1]=2;
                    queue.add(new int[]{r,c-1});
                }
                if(c+1<N &&grid[r][c+1]==1){
                    count--;
                    grid[r][c+1]=2;
                    queue.add(new int[]{r,c+1});
                }
            }
        }
        if(count>0)
            return -1;
        else
            return round;
    }
}
