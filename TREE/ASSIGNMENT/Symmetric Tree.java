class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root==null || Mirror(root.left,root.right);
        
    }
    public boolean Mirror(TreeNode n1,TreeNode n2)
    {
        if(n1==null  && n2==null)
        {
            return true;
        }
        if(n1==null  || n2==null)
        {
            return false;
        }
        if(n1.val!=n2.val)
        {
            return false;
        }
        return Mirror(n1.left,n2.right)&& Mirror(n1.right,n2.left);
    }
}
