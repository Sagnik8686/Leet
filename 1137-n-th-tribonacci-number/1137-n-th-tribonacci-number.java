class Solution {
    public int tribonacci(int n) {
        int a=0,b=1,c=1,d=0;
        for(int i=3;i<=n;i++){
            d=a+b+c;
            // s+=d;
            a=b;
            b=c;
            c=d;
        }
        if(n==1 || n==2)
            return 1;
        else if(n==0)
            return 0;
        else
            return d;
    }
}