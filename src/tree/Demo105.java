package tree;

import java.util.Arrays;

public class Demo105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0 || inorder.length==0)
            return null;
        TreeNode temp = new  TreeNode(preorder[0]);
        for (int i = 0; i <preorder.length ; i++) {
            if(preorder[0]==inorder[i]){
                temp.left = buildTree(Arrays.copyOfRange(preorder,1,i+1),Arrays.copyOfRange(inorder,0,i));
                temp.right=buildTree(Arrays.copyOfRange(preorder,i+1, preorder.length),Arrays.copyOfRange(inorder,i+1,inorder.length));
            }
        }
        return temp;
    }
}
