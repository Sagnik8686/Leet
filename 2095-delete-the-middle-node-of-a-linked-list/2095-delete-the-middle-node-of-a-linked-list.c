/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteMiddle(struct ListNode* head) {
    struct ListNode *temp=head;
    struct ListNode *temp2=head;
    int size=0;
    while(temp!=NULL){
        size++;
        temp=temp->next;
    }
    if(size==1)
        return NULL;
    for(int i=0;i<size/2-1;i++){
        temp2=temp2->next;
    }
    struct ListNode *del;
    del=temp2->next;
    temp2->next=temp2->next->next;
    free(del);
    return head;
}