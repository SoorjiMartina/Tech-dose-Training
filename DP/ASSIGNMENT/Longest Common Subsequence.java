class Solution {
    public int longestCommonSubsequence(String t, String s) {
        int m = t.length();
        int n = s.length();
        if(m==0 || n==0)
        {
            return 0;
        }
        int [] []  tp = new int[m+1][n+1];
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(t.charAt(i-1)==s.charAt(j-1))
                {
                    tp[i][j]= 1 + tp[i-1][j-1];
                }
                else
                {
                    tp[i][j] =Math.max(tp[i][j-1],tp[i-1][j]);
                }
            }
        }
        return tp[m][n];
    }
}
