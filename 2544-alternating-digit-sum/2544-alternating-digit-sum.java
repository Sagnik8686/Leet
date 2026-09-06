class Solution {
    public int alternateDigitSum(int n) {
        int c=0,sum=0,count=0,copy=n;
        while(copy!=0){
            count++;
            copy/=10;
        }
        if(count%2==0)
            c=1;
        while(n!=0){
            if(c==0)
            {
                sum+=n%10;c=1;
            }
            else
            {
                sum-=n%10;c=0;
            }
            n/=10;
        }
        return sum;
    }
}