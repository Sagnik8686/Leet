class Solution {
    public void reverseString(char[] s) {
        int a=0,b=s.length-1;
        char temp=' ';
        while(a<b){
            temp=s[a];
            s[a]=s[b];
            s[b]=temp;
            a++;
            b--;
        }
    }
}