package tree;

import java.util.Arrays;

public class Demo106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length==0 || postorder.length==0)
            return null;
        TreeNode root = new TreeNode(postorder[postorder.length-1]);
        for (int i = 0; i < postorder.length ; i++) {
            if(postorder[postorder.length-1]==inorder[i]){
                root.left=buildTree(Arrays.copyOfRange(inorder,0,i),Arrays.copyOfRange(postorder,0,i));
                root.right=buildTree(Arrays.copyOfRange(inorder,i+1,inorder.length),Arrays.copyOfRange(postorder,i+1,inorder.length-i));
            }
        }
        return root;

    }
}
