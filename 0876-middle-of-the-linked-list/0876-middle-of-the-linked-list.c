/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* middleNode(struct ListNode* head) {
    struct ListNode *temp=head;
    int size=0;
    while(temp!=NULL){
        size++;
        temp=temp->next;
    }
    for(int i=0;i<size;i++){
        if(i<size/2)
            head=head->next;
    }
        return head;
}
