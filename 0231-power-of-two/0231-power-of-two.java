class Solution {
    public boolean isPowerOfTwo(int n) {
        int val=1;
        while(val<=n/2){
            val*=2;
        }
        return val==n;
    }
}