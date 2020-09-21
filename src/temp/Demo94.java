package temp;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
created by cwy on 2019.03.12
给定一个二叉树，返回它的中序 遍历。

示例:

输入: [1,null,2,3]
   1
    \
     2
    /
   3

输出: [1,3,2]
进阶: 递归算法很简单，你可以通过迭代算法完成吗？


 */
public class Demo94 {
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> list=new ArrayList<>();
            if(root!=null){
                list=inorderTraversal(root.left);
                list.add(root.val);
                list=inorderTraversal(root.right);
            }
            return list;

        }
    }
    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        TreeNode cur=root;
        while(cur!=null ||stack.isEmpty()){
            if(cur!=null){
                stack.push(cur);
                cur=cur.left;}
            else{
                cur=stack.pop();
                list.add(cur.val);
                cur=cur.right;
            }
        }
        return list;
    }
}
