package Tooffer;

public class Demo26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A==null && B==null)
            return true;
        if(A==null)
            return false;
        if(B==null)
            return false;
        if(helper(A,B))
            return true;
        if(isSubStructure(A.left,B)) return true;
        if(isSubStructure(A.right,B)) return true;
        return false;
    }

    public boolean helper(TreeNode a,TreeNode b){
        if(a==null && b==null)
            return true;
        if(a==null)
            return false;
        if(b==null)
            return true;
        if(a.val == b.val){
            if(helper(a.left,b.left) && helper(a.right,b.right))
                return true;
            else
                return false;
        }
        return false;
    }

}
