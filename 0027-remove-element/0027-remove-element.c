int removeElement(int* nums, int numsSize, int val) {
    int i,a=0, countVal=0;
    //int newNum[numsSize];
    for(i=0;i<numsSize;i++){
        if(nums[i]==val){
           countVal++;
        }
    }
    for(i=0;i<numsSize;i++){
        if(nums[i]!=val && a<numsSize-countVal ){
            nums[a]=nums[i];
            a++;
        }
    }
    return a;
 
}