int searchInsert(int* nums, int numsSize, int target) {
    int a=0,b=numsSize-1,mid=0;
    while(a<b){
        mid=(a+b)/2;
        if(target<=nums[mid]){
            b=mid;
        }
        else{
            a=mid+1;
        }
    }
    if(target>nums[a])
        return a+1;
    else
        return a;
}