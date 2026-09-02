class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min=nums[0],max=nums[0];
        int i;
        if(nums.length<=2)
            return -1;
        for(i=0;i<nums.length;i++){
            if(nums[i]>max)
                max=nums[i];
            else if(nums[i]<min)
                min=nums[i];
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]!=max&& nums[i]!=min)
                break;
        }
        return nums[i];
    }
}