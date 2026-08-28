class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int i=0,j=s.length()-1;
        char ch1=' ',ch2=' ';
        while(i<j){
            ch1=s.charAt(i);
            ch2=s.charAt(j);
            if((ch1>=97 && ch1<=122 && ch2>=97&&ch2<=122 || ch1>=48&&ch1<=57&&ch2>=48&&ch2<=57)&& ch1==ch2)
            {
                i++;j--;
            }
            else if(ch1<97 && ch1>57||ch1<48||ch1>122)
                i++;
            else if(ch2<97 && ch2>57||ch2<48||ch2>122)
                j--;
            else
                return false;
        }
        return true;
    }
}