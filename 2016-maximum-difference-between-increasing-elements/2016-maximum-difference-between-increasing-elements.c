int maximumDifference(int* nums, int numsSize) {
    int maxDiff=0,min=nums[0],max;
    for(int i=1;i<numsSize;i++){
        max=nums[i];
        if(max-min>0 &&maxDiff<max-min)
        {
            maxDiff=max-min;
        }
        else if(max-min<0){
            min=nums[i];
        }
    }
    if(maxDiff>0)
    return maxDiff;
    else
    return -1;
}