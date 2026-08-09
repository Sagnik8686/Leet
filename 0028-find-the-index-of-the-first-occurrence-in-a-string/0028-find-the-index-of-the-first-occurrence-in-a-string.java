class Solution {
    public int strStr(String haystack, String needle) {
       int l1=needle.length(),l2=haystack.length();
       String s1=" ";
       for(int i=0;i<l2-l1+1;i++)
       {
           s1=haystack.substring(i,i+l1);
           if(needle.equals(s1))
           return i;
       }
       return -1;
    }
}