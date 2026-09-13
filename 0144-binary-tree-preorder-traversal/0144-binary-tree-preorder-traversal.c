/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int countNodes(struct TreeNode* node){
    if(node==NULL)
        return 0;
    return 1+countNodes(node->left)+countNodes(node->right);
}
void preorder(struct TreeNode* root,int *arr,int *index){
    if(root==NULL)
        return;
    arr[(*index)++]=root->val;
    preorder(root->left,arr,index);
    preorder(root->right,arr,index);
    // return arr;
}
int* preorderTraversal(struct TreeNode* root, int* returnSize) {
    int size=countNodes(root);
    int *arr=malloc(size*sizeof(int));
    *returnSize=size;
    int index=0;
    preorder(root,arr,&index);
    return arr;
}

