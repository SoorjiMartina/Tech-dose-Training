class Solution {
    public int numTrees(int n) {
        return nums(1,n);
        
    }
    public int nums(int root, int n)
    {
        if(n<=root)
        {
            return 1;
        }
        else if(n-root==1)
        {
            return 2;
        }
        int count=0;
        for(int i=root;i<=n;i++)
        {
            count+=nums(root,i-1)*nums(i+1,n);
        }
        return count;
    }
}
