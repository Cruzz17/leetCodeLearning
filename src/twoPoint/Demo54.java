package twoPoint;

import java.util.ArrayList;
import java.util.List;

public class Demo54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int l = 0, r = matrix[0].length-1, t = 0, b = matrix.length-1;
        List<Integer> res=new ArrayList<>();
        while (true){
            for (int i = l; i <=r ; i++) {
                res.add(matrix[t][i]);
            }
            if(++t > b) break;
            for (int i = t; i <=b ; i++) {
                res.add(matrix[i][r]);
            }
            if(l>--r) break;
            for (int i = r; i >=l ; i--) {
                res.add(matrix[b][i]);
            }
            if(--b<t) break;
            for (int i = b; i >=t ; i--) {
                res.add(matrix[i][l]);
            }
            if(r>++l) break;
        }
        return res;
    }

    public static void main(String[] args) {
        int [][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        Demo54 demo54 = new Demo54();
        System.out.println(demo54.spiralOrder(nums));
    }
}
