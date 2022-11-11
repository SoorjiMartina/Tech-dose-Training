class Solution {
    public int maxPathSum(TreeNode root) {
        int []  max = new int[]{Integer.MIN_VALUE};
        max(root,max);
        return max[0];    
    }
    public int max(TreeNode root,int [] max)
    {
        if (root==null)
        {
            return 0;
        }
        int left = max(root.left,max);
        left = Math.max(left,0);
        int right = max(root.right,max);
        right = Math.max(right,0);
        int currsum = left+right+root.val;
        max[0]= Math.max(max[0],currsum);
        return Math.max(left,right)+root.val;
        
    }
}
