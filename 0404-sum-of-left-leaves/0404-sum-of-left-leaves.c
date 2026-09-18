/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
void add(struct TreeNode* root,int* s,int isLeft){
    if(root==NULL)
        return;
    if(root->left==NULL&&root->right==NULL&&isLeft)
        *s+=root->val;
    add(root->left,s,1);
    add(root->right,s,0);
}
int sumOfLeftLeaves(struct TreeNode* root) {
    // struct TreeNode* temp=root;
    if(root->left==NULL&&root->right==NULL)
        return 0;
    int s=0;
    add(root,&s,0);
    return s;
}
    