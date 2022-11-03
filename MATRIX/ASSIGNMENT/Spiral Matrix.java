class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        if(matrix==null || matrix.length==0)
        {
            return new ArrayList<>();
        }
        int m = matrix.length;
        int up=0;
        int down =matrix.length-1;
        int n = matrix[0].length;
        int r = matrix[0].length-1;
        int l = 0;
        while(res.size()!=m*n){
        for(int i=l ; i<=r&&res.size()!=m*n;i++)
        {
            res.add(matrix[up][i]);
        }
        for(int i=up+1;i<=down &&res.size()!=m*n;i++)
        {
            res.add(matrix[i][r]);
        }
        for(int i=r-1;i>=l&&res.size()!=m*n;i--)
        {
            res.add(matrix[down][i]);
        }
        
        for(int i= down-1;i>=up+1 && res.size()!=m*n;i--)
        {
            res.add(matrix[i][l]);
        }
        up++;
        down--;
        l++;
        r--;
        }
        return res;
    }
}
