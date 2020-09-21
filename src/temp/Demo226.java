package temp;

/*
created by cwy on 2019 01.30

 */
public class Demo226 {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return null;
        reverse(root);
        invertTree(root.right);
        invertTree(root.left);
        return root;
    }
    public void reverse(TreeNode root){
        if(root==null)
            return;
        else{
            TreeNode temp=root.right;
            root.right=root.left;
            root.left=temp;
        }
    }

    public static void main(String[] args) {

    }
}
