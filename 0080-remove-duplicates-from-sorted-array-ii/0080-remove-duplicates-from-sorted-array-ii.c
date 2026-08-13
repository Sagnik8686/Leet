int removeDuplicates(int* nums, int numsSize){
    int count=0;
    int a=0,b=0,c=0;
    int i=0;
    while(b<numsSize){
        if(nums[a]==nums[b]){
            count++;
            // i++;
            b++;
            continue;
        }
        if(count>=2){
            nums[c]=nums[a];
            nums[c+1]=nums[a];
            c+=2;
        }
        else{
            nums[c]=nums[a];c++;
        }
        a=b;count=0;
    }
    if(count>=2){
            nums[c]=nums[a];
            nums[c+1]=nums[a];
            c+=2;
        }
        else{
            nums[c]=nums[a];c++;
        }
    return c;
}
