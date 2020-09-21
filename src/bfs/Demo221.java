package bfs;

public class Demo221 {
    private int[] x = {0, 1, 1};
    private int[] y = {1, 0, 1};
    private int res;

    public int maximalSquare(char[][] matrix) {
        dfs(matrix,0,0);
        return res*res;
    }

    public void dfs(char[][] matrix, int i, int j) {
        if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length || matrix[i][j] == '0')
            return;
        if(judeg(matrix,i,j+1) &&judeg(matrix,i+1,j)&&judeg(matrix,i+1,j+1)){
            res++;
            dfs(matrix,i,j+1);
            dfs(matrix,i+1,j);
            dfs(matrix,i+1,j+1);
        }
    }

    public boolean judeg(char[][] matrix, int i, int j){
        if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length || matrix[i][j] == '0')
            return false;
        else
            return true;
    }
}
