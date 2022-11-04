class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>((a,b)->(a.val-b.val));
        ListNode d = new ListNode(0);
        ListNode tail = d;
        for(ListNode node : lists)
        {
            if(node!=null)
            {
              pq.add(node);
            }
        }
        while(!pq.isEmpty())
        {
            tail.next = pq.poll();
            tail= tail.next;
            if(tail.next!= null)
            {
                pq.add(tail.next);
            }
        }
        
      return d.next;  
    }
}
