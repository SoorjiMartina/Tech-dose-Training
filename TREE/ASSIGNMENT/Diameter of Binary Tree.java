class Solution {
    public int diameterOfBinaryTree(TreeNode node) {
        if(node==null)
        {
            return 0;
        }
        int lheight = height(node.left);
        int rheight = height(node.right);
        int dleft = diameterOfBinaryTree(node.left);
        int dright =diameterOfBinaryTree(node.right);     
        int fd = Math.max(lheight+rheight,Math.max(dleft, dright));
        return fd;
    }
    public int height(TreeNode node)
    {
       return (node==null) ? 0 : 1+Math.max(height(node.left),height(node.right));
    }
}
