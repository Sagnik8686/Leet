class Solution {
    public char repeatedCharacter(String s) {
        int min=1000,ind=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    if(min>(j)){
                        min=j;ind=i;}
                }
            }
        }
        return s.charAt(ind);
    }
}