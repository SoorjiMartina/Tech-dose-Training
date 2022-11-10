class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
       
       return preorderbst(preorder,0,preorder.length-1);
    }
    public TreeNode preorderbst(int[]root,int start, int end)
    {
        if(start> end)
        {
            return null;
        }
        TreeNode list = new TreeNode(root[start]);
        int mid = start+1;
        while(mid<root.length&& root[mid]<root[start])
        {
            mid++;
        }
        list.left = preorderbst(root,start+1,mid-1);
        list.right = preorderbst(root,mid,end);
        return  list;
    }
}
