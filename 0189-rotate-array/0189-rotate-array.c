void rotate(int* nums, int numsSize, int k) {
    int rot=k%numsSize;
    int temp=0,i,a=0,b=numsSize-1;
    while(a<b){
        temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
        a++;b--;
    }
    a=0;b=rot-1;temp=0;
    while(a<b){
        temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
        a++;b--;
    }
    a=rot;b=numsSize-1;temp=0;
    while(a<b){
        temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
        a++;b--;
    }
    
}