class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0,sumVal=0;
        for(int i=0;i<nums.length;i++){
            sumVal+=nums[i];
            if(nums[i]>9){
                sum+=digitSum(nums[i]);
            }
            else
                sum+=nums[i];
        }
        return sumVal-sum;
    }
    int digitSum(int n){
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}