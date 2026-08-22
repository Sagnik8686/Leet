int mySqrt(int x) {
    int i;
    for(i=1;i<=(x);i++){
        if(i>x/i)
            break;
    }
    return i-1;
}