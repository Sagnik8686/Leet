class Solution {
    public int firstMissingPositive(int[] nums) {
        int i, min = 1,max=nums.length;
        // if(max==1 && nums[0]==1)
        //     return 2;
        for(i=0;i<max;i++){
            if(nums[i]<=0|| nums[i]>max)
               nums[i]=max+1;
        }
        for(i=0;i<max;i++){
            if((int)Math.abs(nums[i]) > 0 && Math.abs(nums[i]) <= max&&nums[(int)Math.abs(nums[i]) - 1] > 0)
                nums[(int)Math.abs(nums[i])-1]*=-1;
        }
        for(i=1;i<=max;i++){
            if(nums[i-1]>=0)
                break;
        }
        return i;
    }
}
