/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    struct ListNode *counter=head;
    int count=0,i;
    struct ListNode *temp=head;
    struct ListNode *del=malloc(sizeof(struct ListNode));
    while(counter!=NULL){
        count++;
        counter=counter->next;
    }
    if(n==count){
        head=head->next;
        // return NULL;
    }
    else{
        for(i=1;i<count-n;i++){
            temp=temp->next;
        }
        //temp is pointing to 3 for first test case
        del=temp->next;
        temp->next=temp->next->next;
        free(del);
    }
    return head;

}