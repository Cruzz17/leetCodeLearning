package Tooffer;

import java.util.ArrayList;
import java.util.List;

public class Demo32 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {

        if(root == null)
            return result;
        helper(root,0);
        return result;
    }

    public void helper(TreeNode root,int depth){
        if(root == null)
            return;
        if (result.size() == depth)
            result.add(new ArrayList<>());
        if(depth%2==0){
            result.get(depth).add(root.val);

        }else{
            result.get(depth).add(0,root.val);
        }
        helper(root.left, depth+1);
        helper(root.right, depth+1);
    }

}
