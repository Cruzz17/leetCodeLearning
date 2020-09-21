package dfs;

public class Demo130 {
    public void solve(char[][] board) {
        boolean[][] gird = new boolean[board.length][board[0].length];
        StringBuffer s = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                boolean isEdge = i == 0 || j == 0 || i == board.length - 1 || j == board[0].length - 1;
                if (isEdge && board[i][j] == 'O') {
                    dfs(i, j,board,gird);
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(!gird[i][j])
                    board[i][j]='X';
            }
        }
    }

    private void dfs(int i, int j, char[][] board, boolean[][] grid){
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j]=='X' || grid[i][j]==true) {
            return;
        }
        grid[i][j]=true;
        dfs(i+1,j,board,grid);
        dfs(i-1,j,board,grid);
        dfs(i,j+1,board,grid);
        dfs(i,j-1,board,grid);
    }
}
