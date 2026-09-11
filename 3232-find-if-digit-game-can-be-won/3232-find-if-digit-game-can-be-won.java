class Solution {
    public boolean canAliceWin(int[] nums) {
        if (nums.length == 1){return true;};
        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < nums.length; ++i){
            if (nums[i] < 10){ sum1 += nums[i];};
            if (nums[i] >= 10){ sum2 += nums[i];};
        }
        return sum1 > sum2 || sum2 > sum1;
    }
}