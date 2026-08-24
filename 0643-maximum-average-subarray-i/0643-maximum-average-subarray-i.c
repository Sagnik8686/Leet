double findMaxAverage(int* nums, int numsSize, int k) {
    int a=0,b=k-1,max=0,sum=0;
    if(numsSize==1)
        return (double)nums[0]/k;
    while(a<=b){
        sum=sum+nums[a];
        a++;
    }
    max=sum;
    b++;a=0;
    while(b<numsSize){
        
        sum=sum-nums[a++];
        sum=sum+nums[b++];
        // if(b>=numsSize){
        //     if(sum>=max)
        //         max=sum;
        // }
       if(sum>=max){
            max=sum;
        }
    }
    return (double)max/k;
}