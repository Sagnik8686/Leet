class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk= new Stack<>();
        char ch=' ';
        if(s.length()==1)
            return false;
        stk.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            ch=s.charAt(i);
            if(ch=='{'||ch=='['||ch=='(')
                stk.push(ch);
            else{
                if(stk.isEmpty()==false&&ch==')'&&stk.peek()=='(')
                    stk.pop();
                else if(stk.isEmpty()==false&&ch==']'&&stk.peek()=='[')
                    stk.pop();
                else if(stk.isEmpty()==false&&ch=='}'&&stk.peek()=='{')
                    stk.pop();
                else 
                    return false;
            }
        }
        return stk.isEmpty();
    }
}