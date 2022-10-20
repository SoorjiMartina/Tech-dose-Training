class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(i==j || j==grid.length-i-1)
                {
                    if(grid[i][j]==0)
                    {
                        count=1;
                        break;
                    }
                }
                else
                {
                    if(grid[i][j]!=0)
                    {
                        count=1;
                        break;
                    }
                }
            }
        }
        return (count==0)?true : false;
    }
}
