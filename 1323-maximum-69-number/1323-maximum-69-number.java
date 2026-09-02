class Solution {
    public int maximum69Number (int num) {
        String s=Integer.toString(num);
        int newNum=0,c=0;
        char ch=' ';
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(ch=='6'&& c==0){
                newNum=newNum*10+((ch-'0')+3);c++;
            }
            else
                newNum=newNum*10+(ch-'0');
        }
        return newNum;
    }
}