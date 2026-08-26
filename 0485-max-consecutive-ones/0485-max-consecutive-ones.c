int findMaxConsecutiveOnes(int* nums, int numsSize) {
    int b=0,c=0,max=0;
    while(b<numsSize){
        if(nums[b]==1){
            c++;
        }
        else if(c>max){
            max=c;
            c=0;
        }
        else if(nums[b]==0)
            c=0;
        b++;
    }
    if(c>max)
        max=c;
    return max;
}