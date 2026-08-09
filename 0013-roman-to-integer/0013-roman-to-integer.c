int romVal(char n);
int romanToInt(char* s) {
    int i = 0, count = 0, val1 = 0, val2 = 0, val = 0;
    while (s[i] != '\0') {
        count++;
        i++;
    }
    if(count==1)
        return romVal(s[0]);
    else{
        // if(romVal(s[count-1])>romVal(s[count-2]))
        //     val=val+(romVal(s[count-1])-romVal(s[count-1]));
        // else
        //      val=val+(romVal(s[count-1])+romVal(s[count-1]));
        val=romVal(s[count-1]);   
        for(int i=count-2;i>=0;i--){
            val1=romVal(s[i]);
            val2=romVal(s[i+1]);
            if(val1<val2)
                val=val-val1;
            else
                val=val+val1;
        }
        return val;
    }
  
}
int romVal(char n) {
    if (n == 'I')
        return 1;
    else if (n == 'V')
        return 5;
    else if (n == 'X')
        return 10;
    else if (n == 'L')
        return 50;
    else if (n == 'C')
        return 100;
    else if (n == 'D')
        return 500; 
    else 
        return 1000;
}
