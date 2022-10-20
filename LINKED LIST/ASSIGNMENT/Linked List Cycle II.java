public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        HashSet<ListNode> set = new HashSet<>();
        while(head!=null){
            if(set.contains(head)) return head;
            set.add(head);
            head=head.next;
        }
        return null;
    }
}
Footer
© 2022 GitHub, In
