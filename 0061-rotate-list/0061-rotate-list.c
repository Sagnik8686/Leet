/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
void makeCirc();
struct ListNode* rotateRight(struct ListNode* head, int k) {
    struct ListNode* temp=head;
    int count=0;
    while(temp!=NULL){
        count++;
        temp=temp->next;
    }
    if(head==NULL || k==0 || head->next==NULL)
        return head;
    k=k%count;
    if(k==0)
        return head;
    struct ListNode* divfirst=head;
    struct ListNode* divsec=head;
    int i=1;
    while(i<count-k){
        divfirst=divfirst->next;
        i++;
    }
    i=1;
    while(i<count){
        divsec=divsec->next;
        i++;
    }
    struct ListNode* newHead=divfirst->next;
    divfirst->next = NULL;
    divsec->next=head;
    return newHead;

}
    