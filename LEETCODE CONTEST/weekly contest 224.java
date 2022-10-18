class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int count=0;
        int maxlen=0;
        for(int [] r : rectangles)
        {
            int val = Math.min(r[0],r[1]);
            if(maxlen<val)
            {
                maxlen= val;
                count=1;
            }
             else if(maxlen==val)
            {
                count++;
            }
        }
        return count;
    }
}
