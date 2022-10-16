
struct ListNode* reverseList(struct ListNode* head){
    struct ListNode * prev = NULL;
    while(head)
    {
        struct Listnode * temp = head->next;
        head->next = prev;
        prev= head;
        head= temp;
    }
    return prev;
}
