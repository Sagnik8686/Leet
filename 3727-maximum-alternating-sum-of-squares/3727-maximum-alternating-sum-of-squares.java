class Solution {
    public long maxAlternatingSum(int[] nums) {
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
                nums[i]*=-1;
        }
        Arrays.sort(nums);
        long scrNeg=0,scrPos=0;
        
        for(i=0;i<nums.length/2;i++){
            scrNeg-=(long)Math.pow(nums[i],2);
        }
        for(i=nums.length/2;i<nums.length;i++){
            scrNeg+=(long)Math.pow(nums[i],2);
        }
        return scrPos+scrNeg;
    }
}