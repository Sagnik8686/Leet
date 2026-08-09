class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        int ar[]=new int[2];
        for(i=0;i<nums.length-1;i++)
        {
            for(j=1+i;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                   return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}