struct ListNode* mergeTwoLists(struct ListNode* l1, struct ListNode* l2){
    struct ListNode* newhead=NULL;
    struct ListNode* sorting;
    if(l1==NULL)
    return l2;
    if(l2==NULL)
    return l1;
    if(l1&&l2)
    {
        if(l1->val <= l2->val)
        {
            sorting = l1;
            l1=sorting->next;
        }
        else
        {
            sorting=l2;
            l2=sorting->next;
        }
    }
    newhead= sorting;
    while(l1&&l2)
    {
         if(l1->val <= l2->val)
        {
            sorting->next=l1;
            sorting =l1;
            l1=sorting->next;
        }
        else
        {
            sorting->next=l2;
            sorting=l2;
            l2=sorting->next;
        }
}
    if(l1==NULL)
    sorting->next=l2;
    if(l2==NULL)
    sorting->next=l1;
return newhead;

}
