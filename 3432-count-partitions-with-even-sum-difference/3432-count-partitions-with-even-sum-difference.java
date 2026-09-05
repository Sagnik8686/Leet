class Solution {
    public int countPartitions(int[] nums) {
        int max[]=new int[nums.length-1];
        int min[]=new int[max.length];
        int i,count=0;
        max[0]=nums[0];
        min[max.length-1]=nums[nums.length-1];
        for(i=1;i<max.length;i++){
            max[i]=nums[i]+max[i-1];
        }
        for(i=max.length-2;i>=0;i--){
            min[i]=min[i+1]+nums[i+1];
        }
        for(i=0;i<max.length;i++){
            if((max[i]-min[i])%2==0)
                count++;
        }
        return count;
    }
}