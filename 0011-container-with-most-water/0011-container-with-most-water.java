class Solution {
    public int maxArea(int[] height) {
        int a=0,b=height.length-1,maxArea=0;
        while(a<b){
            if(height[a]<height[b]){
                maxArea=Math.max(maxArea,height[a]*(b-a));a++;
            }
            else if(height[a]>height[b]){
                maxArea=Math.max(maxArea,height[b]*(b-a));b--;
            }
            else
            {
                maxArea=Math.max(maxArea,height[b]*(b-a));b--;a++;
            }
        }
        return (int)maxArea;
    }
}