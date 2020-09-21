package everyDay;

import Tooffer.TreeNode;

public class Demo8 {
    public int diameterOfBinaryTree(TreeNode root) {
        int depth = 0;
        return depth(root.left,depth)+depth(root.right,depth);
    }

    public int depth(TreeNode root, int depth){
        if(root==null)
            return depth;
        else {
            return Math.max(depth(root.left, depth),depth(root.right,depth))+1;
        }
    }
}
