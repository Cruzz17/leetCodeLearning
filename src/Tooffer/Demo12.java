package Tooffer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo12 {

    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int left = 0;
        if(root.left != null){
            left = getDepth(root.left);
        }
        int right = 0;
        if(root.right != null){
            right=getDepth(root.right);
        }
        if(Math.max(right,left) - Math.min(right,left) > 1){
            return false;
        }else {
            return isBalanced(root.left) && isBalanced(root.right);
        }

    }
    public int getDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = 0;
        if(root.left != null){
            left = getDepth(root.left);
        }
        int right = 0;
        if(root.right != null){
            right = getDepth(root.right);
        }
        return Math.max(right, left) + 1;
    }
    public static void main(String[] args) {
        TreeNode r1 = new TreeNode(1);
        TreeNode r2 = new TreeNode(2);
        TreeNode r3 = new TreeNode(2);
        TreeNode r4 = new TreeNode(3);
        TreeNode r5 = new TreeNode(3);
        TreeNode r6 = new TreeNode(4);
        r1.left = r2;
        r1.right = r3;
        r2.left = r4;
        r2.right = r5;
        r4.left = r6;
        Demo12 demo12 = new Demo12();
        StringBuilder sb = new StringBuilder("sfsdf");
        System.out.println(demo12.isBalanced(r1));
    }

}
