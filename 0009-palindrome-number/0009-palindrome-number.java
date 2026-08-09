class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        else {
            return chkPal(x);
        }
    }

    public boolean chkPal(int x) {
        int copy = x, s = 0;
        while (copy != 0) {
            s = (s * 10) + (copy % 10);
            copy /= 10;
        }
        return s == x;
    }
}