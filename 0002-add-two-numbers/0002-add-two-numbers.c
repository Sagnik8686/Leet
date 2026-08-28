/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode *add=malloc(sizeof(struct ListNode));
    struct ListNode *head=add;
    struct ListNode *prev;
    struct ListNode *ptr1=l1;
    struct ListNode *ptr2=l2;
    struct ListNode *ptr1cpy=ptr1;
    struct ListNode *ptr2cpy=ptr2;
    int size1=1,size2=1,sizeSmall,i,sum,digit=0,carry=0;
    while(ptr1->next!=NULL){
        size1++;
        ptr1=ptr1->next;
    }
    while(ptr2->next!=NULL){
        size2++;
        ptr2=ptr2->next;
    }
    if(size1<size2){
        // sizeSmall=size1;
        // ptr1=malloc(sizeof(struct ListNode));
        for(i=0;i<size2-size1;i++){
            ptr1->next=malloc(sizeof(struct ListNode));
            ptr1->next->val=0;
            ptr1=ptr1->next;
        }
        ptr1->next=NULL;
    }
    else
    {
        // ptr2=malloc(sizeof(struct ListNode));
        for(i=0;i<size1-size2;i++){
            ptr2->next=malloc(sizeof(struct ListNode));
            ptr2->next->val=0;
            ptr2=ptr2->next;
        }
        ptr2->next=NULL;
    }
    // l1=ptr1cpy;
    // l2=ptr2cpy;
    while(ptr1cpy!=NULL)
    {
        sum=ptr1cpy->val+ptr2cpy->val+carry;
        digit=sum%10;
        carry=sum/10;
        prev=add;
        add->next=malloc(sizeof(struct ListNode));
        // add->val=0;
        add->val=digit;
        // if(sum>=10){
        //      add->next->val=carry;
        // }
        add=add->next;
        ptr1cpy=ptr1cpy->next;
        ptr2cpy=ptr2cpy->next;
    }
    if(carry!=0){
        add->val=carry;add->next=NULL;
    }
    else{
        prev->next=NULL;
        free(add);
    }
    
    return head;
}