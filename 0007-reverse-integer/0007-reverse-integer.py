class Solution:
    def reverse(self, x: int) -> int:
        c=0
        if x<0:
            x*=-1
            c=c+1
        a=str(x)
        a=a[::-1]
        a=int(a)
        if a > 2147483647 or a < -2147483647:
            return 0
        if c==1:
            a*=-1
        return a