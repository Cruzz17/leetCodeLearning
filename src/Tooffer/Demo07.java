package Tooffer;

import java.util.HashMap;
import java.util.Map;

public class Demo07 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        Map<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            index.put(inorder[i], i);
        }
        TreeNode treeNode = helper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, index);
        return treeNode;

    }

    public TreeNode helper(int[] preorder, int pleft, int pright, int[] inorder, int inleft, int inright, Map<Integer, Integer> map) {
        if (pleft > pright)
            return null;
        TreeNode root = new TreeNode(preorder[pleft]);
        int index = map.get(root.val);
        if (pleft != pright) {
            int leftNode = index - inleft, rightNode = inright - index;
            TreeNode leftSub = helper(preorder, pleft + 1, pleft + leftNode, inorder, inleft, index - 1, map);
            TreeNode rightSub = helper(preorder, pright - rightNode + 1, pright, inorder, index + 1, inright, map);
            root.left = leftSub;
            root.right = rightSub;
        }
        return root;
    }
}
