class Solution {
    public boolean canAliceWin(int[] nums) {
        int singSum=0,doubSum=0;
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]<10)
                singSum+=nums[i];
            else
                doubSum+=nums[i];
        }
        if(singSum>doubSum ||doubSum>singSum)
            return true;
        else
            return false;
    }
}