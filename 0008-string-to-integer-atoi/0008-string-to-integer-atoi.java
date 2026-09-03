class Solution {
    public int myAtoi(String s) {
        String num = "";
        char ch = ' ';
        int i, f = 0;
        long sum = 0;
        boolean st=false;
        for (i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch == ' '){
                if(st)
                    break;
                continue;
            }
            else if (ch >= '0' && ch <= '9'){
                num += ch;st=true;}
            else if ((ch == '-' || ch == '+') && (i == 0 || s.charAt(i - 1) == ' ')){
                num += ch;st=true;
            }
            else if ((ch == '-' || ch == '+') && (i != 0 || s.charAt(i - 1) == ' '))
                break;
            else if (ch >= 97 && ch <= 122 || ch >= 65 && ch <= 90 )
                break;
            else
                num += '.';
        }
        if (num.length() == 0)
            return 0;
        num = " " + num;
        for (i = 0; i < num.length(); i++) {
            ch = num.charAt(i);
            if (ch == '-')
                f = 1;
            else if (ch == '+')
                continue;
            else if (ch >= '1' && ch <= '9')
                sum = sum * 10 + (ch - '0');
            else if (ch == '0' && i!=0)
                sum = sum * 10;
            else if (ch == '.')
                break;
            if (f == 1 && sum > 2147483648L)
                return Integer.MIN_VALUE;

            if (f == 0 && sum > 2147483647L)
                return Integer.MAX_VALUE;
        }
        if (f == 1)
            return (int) -sum;
        else
            return (int) sum;
    }
}