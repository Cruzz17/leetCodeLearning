package bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Demo1091 {

    public int shortestPathBinaryMatrix(int[][] grid) {
        int[] dx = {0, 0, 1, -1, 1, -1, 1, -1};
        int[] dy = {1, -1, 0, 0, 1, -1, -1, 1};
        int m = grid.length;
        int n = grid[0].length;
        if (grid[0][0] == 1)
            return -1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        int res = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                int[] point = queue.poll();
                int x = point[0], y = point[1];
                if(x == n-1 && y == m-1)
                    return res;
                for (int i = 0; i < 8; i++) {
                    int newX = x + dx[i];
                    int newY = y + dy[i];
                    if (newX < 0 || newX >= m || newY < 0 || newY >= n || grid[newX][newY]==1)
                        continue;
                    queue.add(new int[]{newX,newY});
                    grid[newX][newY] = 1;
                }
                res++;
            }
        }
        return -1;
    }

}
