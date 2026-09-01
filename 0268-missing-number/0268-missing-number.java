class Solution {
    public int missingNumber(int[] nums) {
        int i,sumA=nums.length,sum=0;
        for(i=0;i<nums.length;i++){
            sum+=nums[i];sumA+=i;
        }
        return sumA-sum;
    }
}