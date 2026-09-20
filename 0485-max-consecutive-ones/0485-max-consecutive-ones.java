class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int a=0,b=0,c=0,max=0;
        while(b<nums.length){
            if(nums[b]==1){
                b++;
                c++;
            }
            else{
                max=Math.max(max,c);
                c=0;
                a=b+1;
                b=a;
            }
        }
        max=Math.max(max,c);
        return max;
    }
}