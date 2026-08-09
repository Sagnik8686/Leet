class Solution {
    public String reverseWords(String s) {
        s=removeSpace(s);
        int l=s.length();char ch1=' ',ch2=' ';String s2="",s3="";
        int i=0,a=l-1;
        StringBuilder sb=new StringBuilder(s);
        while(i<a)
        {
            ch1=s.charAt(i);ch2=s.charAt(a);
            sb.setCharAt(a,ch1);sb.setCharAt(i,ch2);
            i++;a--;
        }
        s2=sb.toString();s2=s2+" ";a=0;
        for(i=0;i<=l;i++)
        {
            ch1=s2.charAt(i);
            if(ch1==' ')
            {
                s3=s3+revWord(s2.substring(a,i))+" ";
                a=i+1;
            }
        }
        
        return s3.trim();
    }
    public String removeSpace(String s){
        s=s.trim();
        String s2="";char c1=' ';int l=s.length(),i;
        for(i=0;i<l;i++)
        {
            c1=s.charAt(i);
            if(c1==' '&&i+1<l&& s.charAt(i+1)==' ')
            {
              continue;
            }
            s2+=c1;
        }
        return s2;
    }
    public String revWord(String s){
        String c="";int l=s.length()-1;
        for(int i=l;i>=0;i--)
        {
            c=c+s.charAt(i);
        }
        return c;
    }
}