class Solution {
    public String capitalizeTitle(String title) {
        int count =0,a=0;
        title=title+" ";
        int l=title.length();
        String s="",newStr="";
        for(int i=0;i<l;i++){
            if(title.charAt(i)==32){
                s=title.substring(a,i);
                if(count>=3){
                    s=s.toLowerCase();
                    s=Character.toUpperCase(s.charAt(0))+s.substring(1);
                    // count=0;
                }
                else{
                    s=s.toLowerCase();
                }
                count=0;
                newStr+=s+" ";
                a=i+1;
            }
            else{
                count++;
            }
        }
        return newStr.trim();
    }
}