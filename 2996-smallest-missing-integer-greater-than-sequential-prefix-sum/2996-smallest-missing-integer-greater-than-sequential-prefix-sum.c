int missingInteger(int* nums, int numsSize) {
    int arr[100];
    int a=0,b=1,i;
    for(i=0;i<numsSize-1;i++){
        if(nums[i+1]-nums[i]==1){
            arr[a]=nums[i];a++;
            continue;
        }
        else
        break;
        // arr[a]=nums[i];a++;break;
    }
    arr[a]=nums[i];
    a=0,b=1;
    int sum=0;
    i=0;
    while(arr[i]!='\0'){
        sum+=arr[i];
        i++;
    }
    for(i=0;i<numsSize;i++){
        if(sum==nums[i]){
            sum++;
            i=0;
        }
        
    }
    return sum;
}