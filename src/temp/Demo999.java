package temp;

public class Demo999 {
    private int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int numRookCaptures(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'R') {
                    count = dfs(board, i, j, direction[0]) + dfs(board, i, j, direction[1]) + dfs(board, i, j, direction[2]) + dfs(board, i, j, direction[3]);
                }
            }
        }
        return count;
    }

    private int dfs(char[][] board, int i, int j, int[] di) {
        int count = 0;
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == 'B')
            return count;
        else if (board[i][j] == 'p')
            count++;
        else
            count += dfs(board, i + di[0], j + di[1], di);
        return count;
    }
}
