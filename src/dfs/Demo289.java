package dfs;

public class Demo289 {
    public static int [][] dirction = {{1,0},{-1,0},{0,1},{0,-1},{1,-1},{-1,1},{1,1},{-1,-1}};
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int [][] help = new int[m][n];
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j <n ; j++) {
                help[i][j]=board[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int count = helper(help,i,j);
                if(board[i][j]==1){
                    if(count<2 || count>3)
                        board[i][j]=0;
                }else if(board[i][j]==0){
                    if(count>=3)
                        board[i][j] = 1;
                }
            }
        }

    }

    public int helper(int[][] board,int i, int j){
        int count =0;
        if (i <0 || i>= board.length || j<0 || j>= board[0].length){
            return count;
        }
        for (int [] di:dirction) {
            if(i+di[0]<0 || j+di[1] <0 || i+di[0]>=board.length || j+di[1]>=board[0].length){
                continue;
            }
            else if(board[i+di[0]][j+di[1]]==1)
                count++;
        }
        return count;
    }
}
