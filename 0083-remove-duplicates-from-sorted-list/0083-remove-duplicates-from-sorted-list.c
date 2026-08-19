/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {
    struct ListNode* temp=head;
    struct ListNode* store=malloc(sizeof(struct ListNode));
    struct ListNode* storeH=store;
    // store->val=temp->val;
    if(temp==NULL)
        return NULL;
    while(temp!=NULL){
        store->val=temp->val;
        while(temp!=NULL && store->val==temp->val){ 
            // store->val=temp->val;
            temp=temp->next;
            
        }
        store->next=malloc(sizeof(struct ListNode));
        // temp=temp->next;
        if(temp!=NULL)
            store=store->next;
        else
            store->next=NULL;
    }
    return storeH;
}