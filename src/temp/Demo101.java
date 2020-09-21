package temp;

public class Demo101 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        else return judgeSymmetric(root.left, root.right);
    }
    public boolean judgeSymmetric(TreeNode left, TreeNode right){
        if(left == null || right == null){
            return false;
        }
        if((right.val == left.val) && (judgeSymmetric(left.left, right.right) && (judgeSymmetric(left.right, right.left)))){
            return true;
        }
        return false;
    }
}
