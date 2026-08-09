/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* plusOne(int* digits, int digitsSize, int* returnSize) {
    digits[digitsSize-1]+=1;
    int i,*newArr;
    for(i=digitsSize-1;i>0;i--){
        if(digits[i]==10){
            digits[i]%=10;
            digits[i-1]++;
        }
    }
    if(digits[0]==10)
    {
        newArr=malloc((digitsSize+1)*sizeof(int));
        *returnSize=digitsSize+1;
        newArr[0]=1;
        digits[0]=0;
        for(i=1;i<=digitsSize;i++){
            newArr[i]=digits[i-1];        }
    }
    else{
        *returnSize=digitsSize;
        return digits;
    }
    return newArr;
}