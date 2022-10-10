class MedianFinder {
    PriorityQueue<Integer> MinHeap;
    PriorityQueue<Integer> MaxHeap;

    public MedianFinder() {
     MaxHeap  = new PriorityQueue(Collections.reverseOrder());
     MinHeap  = new PriorityQueue();
        
    }
    
    public void addNum(int num) {
        MaxHeap.offer(num);
        MinHeap.offer(MaxHeap.poll());
        if(MinHeap.size()> MaxHeap.size())
        {
            MaxHeap.offer(MinHeap.poll());
        }
        
       
    }
    
    public double findMedian() {
        if(MaxHeap.size() == MinHeap.size())
            return (MaxHeap.peek() + MinHeap.peek())/2.0;
        else
            return MaxHeap.peek();
     
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
