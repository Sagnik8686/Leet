/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int count(struct TreeNode* root){
    if(root==NULL)
        return 0;
    if(root->left==NULL)
        return 1+count(root->right);
    if(root->right==NULL)
        return 1+count(root->left);
    int left=count(root->left);
    int right=count(root->right);
    if(right>left)
        return left+1;
    else
        return right+1;
    
}
int minDepth(struct TreeNode* root) {
    return count(root);
}