class Solution {
    public String longestCommonPrefix(String[] strs) {
        String store="";
        int l=strs.length,minL=strs[0].length(),count,i;
        for(i=0;i<l;i++){
            if(minL>strs[i].length())
                minL=strs[i].length();
        }
        for(i=0;i<minL;i++){
            count=0;
            for(int j=0;j<l;j++){
                if(strs[0].charAt(i)==strs[j].charAt(i))
                    count++;
            }
            if(count==l){
                store=store+strs[0].charAt(i);
            }
            else
                break;
        }
        return store;
    }
}