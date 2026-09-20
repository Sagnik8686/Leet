/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
bool mirror(struct TreeNode* l,struct TreeNode* r){
    if(l==NULL && r==NULL)
        return true;
    if(l==NULL && r!=NULL || l!=NULL &&r==NULL)
        return false;
    if(l->val!=r->val)
        return false;
    return mirror(l->left,r->right)&&mirror(l->right,r->left);
}
bool isSymmetric(struct TreeNode* root) {
    if(root==NULL)
        return true;
    return mirror(root->left,root->right);
}