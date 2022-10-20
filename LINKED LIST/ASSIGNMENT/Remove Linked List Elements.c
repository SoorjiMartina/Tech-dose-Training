struct ListNode* removeElements(struct ListNode* head, int val){
    struct ListNode *tmp, *tracker = head;
    if(head == NULL)
        return NULL;
    while(tracker != NULL && tracker == head && tracker->val == val){
        tracker = tracker->next;
        free(head);
        head = tracker;
    }
    while(tracker != NULL){
        if(tracker->next != NULL && tracker->next->val == val){
            tmp = tracker->next;
            tracker->next = tracker->next->next;
            free(tmp);
        }
        else
            tracker = tracker->next;
    }
    return head;
}
