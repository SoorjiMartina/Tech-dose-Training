class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int s=0;
            if(l1!=null){
                s+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                s+=l2.val;
                l2=l2.next;
            }
            s+=carry;
            carry=s/10;
            ListNode node=new ListNode(s%10);
            temp.next=node;
            temp=temp.next;
            
        }
        return dummy.next;
    }
}
