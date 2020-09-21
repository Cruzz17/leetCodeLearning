package Backtracking;


public class Demo98 {
    long cur = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if(root == null)
            return true;
        if(root.left!=null && cur>=root.val)
            return false;
        if(root.right!=null && root.right.val<=root.val)
            return false;
        if(!isValidBST(root.left))
            return false;
        if(!isValidBST(root.right))
            return false;
        return true;
        /*boolean left = isValidBST(root.left);
        if (cur >= root.val) return false;
        cur = root.val;
        boolean right = isValidBST(root.right);
        return left && right;*/
    }
}
