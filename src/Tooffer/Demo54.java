package Tooffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo54 {
    List<Integer> result = new ArrayList<>();
    public int kthLargest(TreeNode root, int k) {
        while (root != null){
            result.add(root.val);
        }
        Comparator<Integer> comparator = Comparator.comparingInt(x->x);
        result.sort(comparator.reversed());
        return result.get(k);
    }
    private void sum(TreeNode root){
        if(root==null)
            return;
        result.add(root.val);
        sum(root.left);
        sum(root.right);
    }
}
