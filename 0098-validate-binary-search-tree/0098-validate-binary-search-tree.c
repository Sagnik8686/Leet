/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int countNodes(struct TreeNode* root){
    if(root==NULL)
        return 0;
    return 1+countNodes(root->left)+countNodes(root->right);
}
void inOrder(struct TreeNode* root,int *arr,int *index){
    if(root==NULL)
        return;
    inOrder(root->left,arr,index);
    arr[(*index)++]=root->val;
    inOrder(root->right,arr,index);
}
bool isValidBST(struct TreeNode* root) {
    int size=countNodes(root);
    int *arr=malloc(size*sizeof(int));
    int index=0;
    inOrder(root,arr,&index);
    int f=0;
    for(int i=1;i<size;i++){
        if(arr[i]<=arr[i-1]){
            f=1;break;
        }
    }
    return f==0;
}