/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *detectCycle(struct ListNode *head) {
    struct ListNode *slow = head;
    struct ListNode *fast = head;
    struct ListNode *temp;
    int f=0;
    while (slow != NULL && fast != NULL && fast->next != NULL) {
        temp=slow;
        slow = slow->next;         
        fast = fast->next->next;   

        if (slow == fast) {
            f=1;break;   
        }
    }
    if(f==1)
        slow=head;
    else
        return NULL;
    while(slow!=fast)
    {
        slow=slow->next;
        fast=fast->next;
    }
    return slow;
}