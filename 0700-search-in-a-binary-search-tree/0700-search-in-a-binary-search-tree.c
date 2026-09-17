/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
struct TreeNode* searchBST(struct TreeNode* root, int key) {
    if(root==NULL)
        return NULL;
    if(root->val==key)
        return root;
    else if(root->val>key)
        return searchBST(root->left,key);
    else
        return searchBST(root->right,key);
}