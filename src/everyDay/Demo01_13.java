package everyDay;

public class Demo01_13 {
    public int movingCount(int m, int n, int k) {
        boolean [][] visted = new boolean[m][n];
        return dfs(k,0,0,visted, m, n);
    }
    private int dfs(int k ,int i, int j, boolean[][] visted, int m, int n){
        if(i<0 || j< 0|| i>=m || j>=n || (i/10 + i%10 + j/10 + j%10) > k || visted[i][j])
            return 0;
        visted[i][j]=true;
        return dfs(k,i-1,j,visted,m,n)+dfs(k,i+1,j,visted,m,n)+dfs(k,i,j-1,visted,m,n)+dfs(k,i,j+1,visted,m,n)+1;
    }

    public static void main(String[] args) {
        Demo01_13 demo01_13 = new Demo01_13();
        System.out.println(demo01_13.movingCount(16,8,4));
        int i = 35, j = 25;
        System.out.println(i/10  );
        System.out.println( i%10);
        System.out.println(j/10 );
        System.out.println( j%10);
    }
}
