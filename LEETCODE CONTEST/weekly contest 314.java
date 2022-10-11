class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int time =0,id=0,max=0;
        for(int [] l : logs)
        {
            int current = l[1]-time;
            if(current > max || (current == max && id>l[0]))
            {
                max = current;
                id=l[0];
            }
            time = l[1];
        }
        return id;
    }
}
