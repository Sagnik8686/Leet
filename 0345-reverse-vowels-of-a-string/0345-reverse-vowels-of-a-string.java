class Solution {
    public String reverseVowels(String s)
    {
       int i,a,l=s.length();char ar[]=new char[l];
        char ch=' '; String s2="";
        a=0;
        for(i=l-1;i>=0;i--)
            {
                ch=s.charAt(i);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ){
                ar[a]=ch;a++;}
            }
        ch=' ';
        a=0;
        for(i=0;i<l;i++)
            {
                ch=s.charAt(i);
                if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A' ||ch=='E'||ch=='I'||ch=='O'||ch=='U' )
                {
                    s2=s2+ar[a];a++;
                }
                else{
                    s2=s2+ch;
                }
            }
        return s2;
    }
}