class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer,Integer>[]r = new HashMap[9];
        Map<Integer,Integer>[]c = new HashMap[9];
        Map<Integer,Integer>[]b = new HashMap[9];
        for(int i=0;i<9;i++)
        {
            r[i]=new HashMap<Integer,Integer>();
            c[i]= new HashMap<Integer,Integer>();
            b[i]= new HashMap<Integer,Integer>();
        }
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
                {
                    if(board[i][j]!='.')
                    {
                        int n = board[i][j];
                        int box = (i/3)*3 + (j/3);
                        r[i].put(n,r[i].getOrDefault(n,0)+1);
                        c[j].put(n,c[j].getOrDefault(n,0)+1);
                        b[box].put(n,b[box].getOrDefault(n,0)+1);
                        if(r[i].get(n)>1 || c[j].get(n) > 1|| b[box].get(n)>1){
                            return false;
                    }
                    }
                }
            }
        return true;
    }
}
