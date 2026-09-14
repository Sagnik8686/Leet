class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1=rec1[0],x2=rec1[2],x3=rec2[0],x4=rec2[2];   
        int y1=rec1[1],y2=rec1[3],y3=rec2[1],y4=rec2[3];
        return Math.min(x2, x4) > Math.max(x1, x3)
            && Math.min(y2, y4) > Math.max(y1, y3); 
    }
}