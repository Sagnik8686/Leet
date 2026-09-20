/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* getConcatenation(int* nums, int numsSize, int* returnSize) {
    int *newNum=malloc((2*numsSize)*sizeof(int));
    int con=numsSize;
    for(int i=0;i<2*numsSize;i++){
        if(i>=numsSize){
            newNum[con]=nums[i-numsSize];
            con++;
        }
        else{
            newNum[i]=nums[i];
        }
    }
    *returnSize=2*numsSize;
    return newNum;
}