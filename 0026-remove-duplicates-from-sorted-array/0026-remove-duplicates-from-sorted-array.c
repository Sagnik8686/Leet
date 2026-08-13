int removeDuplicates(int* nums, int numsSize) {
    int a=0,b=0,i=0;
    int arr[numsSize];
    while(b<numsSize){
        if(nums[a]>=nums[b]){
            nums[i]=nums[b];
        }
        else{
            i++;
            nums[i]=nums[b];
            a=b;
        }
        b++;
    }
    return i+1;
}