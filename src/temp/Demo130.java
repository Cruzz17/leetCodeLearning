package temp;

public class Demo130 {
    public void solve(char[][] board) {
        if(board==null||board.length<=0)
            return;
        //先遍历所有边界的O，对其进行深度搜索，将其全部改成——，然后遍历，将所有的O改成X，将所有的——改成O
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++){
            dfs(board,i,0);
            dfs(board,i,n-1);
        }
        for(int j=0;j<n;j++){
            dfs(board,0,j);
            dfs(board,m-1,j);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O')
                    board[i][j]='X';
                if(board[i][j]=='-')
                    board[i][j]='O';
            }
        }
        return;

    }
    public void dfs(char[][] board,int x,int y){
        if(x<0||x>=board.length||y<0||y>=board[0].length||board[x][y]!='O')
            return;
        board[x][y]='-';
        dfs(board,x+1,y);
        dfs(board,x-1,y);
        dfs(board,x,y-1);
        dfs(board,x,y+1);
    }
}
