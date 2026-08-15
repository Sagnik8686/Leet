/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* searchRange(int* nums, int numsSize, int target, int* returnSize) {
    int *arr=(int*)malloc(2*sizeof(int));
    int left=0,right=numsSize-1,mid=0;
    if(numsSize==0){
        *returnSize=2;
        arr[0]=arr[1]=-1;
        return arr;
    }
    while(left<right){
        mid=left+(right-left)/2;
        if(target<=nums[mid])
            right=mid;
        else
            left=mid+1;
    }
    if(nums[left]==target)
        arr[0]=left;
    else
        arr[0]=-1;
    left=0,right=numsSize-1,mid=0;
    while(left<right){
        mid=left+(right-left+1)/2;
        
        if(target>=nums[mid])
            left=mid;
        else
            right=mid-1;
    }
    if(nums[left]==target)
        arr[1]=left;
    else
        arr[1]=-1;
    *returnSize=2;
    return arr;
}