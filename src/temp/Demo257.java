package temp;

import java.util.ArrayList;
import java.util.List;
/*
给定一个二叉树，返回所有从根节点到叶子节点的路径。

说明: 叶子节点是指没有子节点的节点。

示例:

输入:

   1
 /   \
2     3
 \
  5

输出: ["1->2->5", "1->3"]

解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
 */

public class Demo257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>ret=new ArrayList<>();
        if(root==null)
            return ret;
        dfs(root,"",ret);
        return ret;
    }
    private void dfs(TreeNode root, String prefit, List<String>ret){
        if(root==null)
            return;
        if(root.right==null&&root.left==null)
        {
            ret.add(prefit+root.val);
            return;
        }
        prefit+=(root.val+"->");
        dfs(root.left,prefit,ret);
        dfs(root.right,prefit,ret);
    }
}
