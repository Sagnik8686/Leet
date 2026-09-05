class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int min[]=new int[nums.length],i;
        min[nums.length-1]=nums[nums.length-1];
        for(i=nums.length-2;i>=0;i--){
            min[i]=Math.min(min[i+1],nums[i]);
        }
        int mx=nums[0];
        for(i=0;i<nums.length;i++){
            mx=Math.max(mx,nums[i]);
            if(mx-min[i]<=k)
                return i;
        }
        return -1;
    }
}