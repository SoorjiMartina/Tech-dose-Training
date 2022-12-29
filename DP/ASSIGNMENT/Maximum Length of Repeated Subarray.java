class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int count=0;
        int n = nums1.length;
        int m = nums2.length;
        int [] []  t = new int [n+1][m+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(nums1[i-1]==nums2[j-1])
                {
                    t[i][j] = 1 + t[i-1][j-1];
                    if(count <t[i][j])
                    {
                        count = t[i][j];
                    }
                }
            }
        }
        return count;
    }
}
