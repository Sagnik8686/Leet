int sqr(int n);
bool isHappy(int n) {
    int copy=n,r=0,a;
    if(n==1)
            return true;
        else if(n<=3)
            return false;
    while(true){
        // if(n==1)
        //     return true;
        // else if(n<=3)
        //     return false;
        a=sqr(copy);
        if(a==1 || a==7)
            return true;
        else if(a<=9|| a==n)
            return false;
        copy=a;
    }
}
int sqr(int n){
    int sum=0,r=0;
    while(n!=0)
    {
        r=n%10;
        sum=sum+(r*r);
        n/=10;
    }
    return sum;
}