bool detectCapitalUse(char* word) {
    int i=0,count=0,cap=0;
    while(word[i]!='\0'){
        count++;
        if((int)word[i]>=65 && (int)(word[i])<=90)
            cap++;
        i++;
    }
    if(cap==count ||cap==0||(cap==1&&((int)(word[0])>=65&&(int)(word[0])<=90)))
        return true;
    else
        return false;
}