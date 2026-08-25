int missingMultiple(int* nums, int numsSize, int k) {
    int i,a=1;
    for(i=0;i<numsSize;i++){
        if(nums[i]==k*a){
            i=-1;
            a++;
        }
    }
    return k*a;
    // int karr=malloc(ck*sizeof(int));
    // for(i=0;i<numsSize;i++){
    //     if(nums[i]%k==0){
    //         karr[a]=nums[i];
    //         a++;
    //     }
    // }



}