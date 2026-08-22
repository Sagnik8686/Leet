int mySqrt(int x) {
    int i;
    for(i=1;i<=(x);i++){
        if((long long)i*i>x)
            break;
    }
    return i-1;
}