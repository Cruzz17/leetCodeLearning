package Tooffer;


import java.util.LinkedList;
import java.util.List;

public class Demo34 {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new LinkedList<>();
        LinkedList<Integer> path = new LinkedList<>();
        sum(root, sum,path, result);
        return result;
    }

    public void sum(TreeNode root, int sum, LinkedList<Integer> path,List<List<Integer>> result){
        if(root == null){
            return;
        }
        path.add(root.val);
        if(root.right ==null && root.left ==null){
            if(sum == root.val){
                path.add(root.val);
                result.add(new LinkedList<>(path));
            }
            path.removeLast();
            return;
        }
        sum(root.left, sum -root.val, path, result);
        sum(root.right, sum-root.val, path, result);
        path.removeLast();
    }
    public void sum2(TreeNode root, int sum, LinkedList<Integer> path, List<List<Integer>> result){
        if(root == null || sum - root.val <0){
            return;
        }
        if(sum-root.val == 0 && root.left ==null && root.right == null){
            path.add(root.val);
            result.add(new LinkedList<>(path));
            path.removeLast();
            return;
        }if(sum -root.val>0) {
            path.add(root.val);
            sum2(root.left,sum -root.val, path, result);
            sum2(root.right, sum-root.val, path, result);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(8);
        TreeNode node4 = new TreeNode(11);
        TreeNode node5 = new TreeNode(13);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(2);
        TreeNode node9 = new TreeNode(5);
        TreeNode node10 = new TreeNode(1);
        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node3.left=node5;
        node3.right=node6;
        node4.left=node7;
        node4.right=node8;
        node6.left=node9;
        node6.right=node10;
        Demo34 demo34 = new Demo34();
        System.out.println(demo34.pathSum(node1, 22));

    }
}
