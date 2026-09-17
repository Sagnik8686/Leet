/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
struct TreeNode* insertIntoBST(struct TreeNode* root, int val) {
    struct TreeNode* temp=root;
    struct TreeNode* prev;
    while(temp!=NULL){
        prev=temp;
        if(val>temp->val)
            temp=temp->right;
        else
            temp=temp->left;
    }
    struct TreeNode* node=malloc(sizeof(struct TreeNode));
    node->val=val;
    node->left=NULL;
    node->right=NULL;
    if(root==NULL)
        return node;
    if(prev->val>val)
        prev->left=node;
    else
        prev->right=node;
    return root;
}