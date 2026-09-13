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
void postorder(struct TreeNode* root,int *arr,int *index){
    if(root==NULL)
        return;
    postorder(root->left,arr,index);
    postorder(root->right,arr,index);
    arr[(*index)++]=root->val;
    
    // return arr;
}
int* postorderTraversal(struct TreeNode* root, int* returnSize) {
    int size=countNodes(root);
    int *arr=malloc(size*sizeof(int));
    *returnSize=size;
    int index=0;
    postorder(root,arr,&index);
    return arr;
}

