class Solution {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
       return balance(list,0,list.size()-1);
    }
    public void inorder(TreeNode root,List<Integer> list)
    {
        if(root!=null){
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
        }
    }
    public TreeNode balance(List<Integer> list, int start,int end)
    {
        if(start> end)
        {
            return null;
        }
        int mid = (start+end)/2;
        TreeNode li = new TreeNode(list.get(mid));
        li.left=balance(list,start,mid-1);
        li.right=balance(list,mid+1,end);
        return li;
    }
}
