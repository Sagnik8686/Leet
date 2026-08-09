class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int ec) {
        int i; List<Boolean> s=new ArrayList<>();
        for(i=0;i<c.length;i++){
            s.add(chk(c,c[i]+ec));
        }
    return s;
    }
    public boolean chk(int[] c,int n){
        int i,f=0;
        for(i=0;i<c.length;i++){
            if(n<c[i]){
            f++;break;}
        }
        if(f>0)
        return false;
        else 
        return true;
    }
}