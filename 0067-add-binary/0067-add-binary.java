class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1,j=b.length()-1,k;
        char ch1=' ',ch2=' ',carry='0';
        String sum="";
        if(j<i){
            for(k=0;k<i-j;k++)
                b='0'+b;
        }
        else if(i<j){
            for(k=0;k<j-i;k++){
                a='0'+a;
            }
        }
        i=a.length()-1;
        while(i>=0){
            ch1=a.charAt(i);
            ch2=b.charAt(i);
            i--;
            if(ch1=='1' &&ch2=='1' && carry=='0'){
                sum='0'+sum;
                carry='1';
            }
            else if(ch1=='1'&&ch2=='1'&&carry=='1'){
                sum='1'+sum;
                carry='1';
            }
            else if((ch1=='1'|| ch2=='1')&& carry=='0'){
                sum='1'+sum;
            }
            else if((ch1=='1'|| ch2=='1')&& carry=='1'){
                sum='0'+sum;
                carry='1';
            }
            else if(carry=='0')
                sum='0'+sum;
            else{
                sum='1'+sum;carry='0';}
        }
        if(carry=='1')
            return '1'+sum;
        else
            return sum;
    }
}