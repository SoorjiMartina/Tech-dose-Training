class KthLargest {
    final PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    final int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
            for(int num : nums)
            {
                pq.offer(num);
                if(pq.size()>k)
                {
                    pq.poll();
                }
            }
        
    }
    
    public int add(int val) {
        pq.offer(val);
        if(pq.size() >k)
        {
            pq.poll();
        }
        return pq.peek();
    }
}
