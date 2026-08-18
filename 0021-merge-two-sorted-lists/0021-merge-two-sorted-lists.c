/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    struct ListNode* newList=malloc(sizeof(struct ListNode));
    struct ListNode* newHead=newList;
    if(list1==NULL&&list2==NULL)
        return NULL;
    else if(list1==NULL)
        return list2;
    else if(list2==NULL)
        return list1;
    while(list1!=NULL && list2!=NULL){
        if(list1->val >= list2->val){
            newList->val=list2->val;
            list2=list2->next;
        }
        else{
            newList->val=list1->val;
            list1=list1->next;
        }
        if(list1==NULL || list2==NULL)
            break;
        else{
        newList->next=malloc(sizeof(struct ListNode));
        newList=newList->next;}
    }
    if(list1==NULL && list2==NULL){
        // newList->next=list2->next;
        newList->next=NULL;}
    else if(list1==NULL){
        newList->next=list2;
        // newList->next=NULL;
    }
    else{
        newList->next=list1;
        // newList->next=NULL;
        }
    
    return newHead;
}