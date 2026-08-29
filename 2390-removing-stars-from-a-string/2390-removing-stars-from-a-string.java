class Solution {
    public String removeStars(String s) {
        // s+=" ";
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='*')
            {
                sb.delete(i-1,i+1);
                i=i-2;
            }
        }
        return sb.toString();
    }
}