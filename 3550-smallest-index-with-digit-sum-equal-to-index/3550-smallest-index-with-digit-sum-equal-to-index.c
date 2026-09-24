int sod(int n){
    int sum=0;
    while(n!=0){
        sum+=n%10;
        n/=10;
    }
    return sum;
}
int smallestIndex(int* nums, int numsSize) {
    int i,f=0;
    for( i=0;i<numsSize;i++){
        if(i==sod(nums[i]))
        {
            f=1;break;
        }
    }
    return f==1?i:-1;
}