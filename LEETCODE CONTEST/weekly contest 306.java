class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int res[][] = new int [n-2] [n-2];
        for(int i=0;i<n-2;i++)
        {
            for(int j=0;j<n-2;j++)
            {
                res[i][j]=maxget(grid,i,j);            
            }
        }
        return res;
    }
        public  int maxget(int [][]grid,int i, int j)
        {
            int max= grid[i][j];
            for(int k=i;k<i+3;k++)
            {
                for(int z=j;z<j+3;z++)
                {
                    max=Math.max(grid[k][z],max);
                }
            }
            return max;
        }
}
