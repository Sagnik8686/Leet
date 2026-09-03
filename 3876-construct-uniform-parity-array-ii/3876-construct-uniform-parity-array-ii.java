class Solution {
    public boolean uniformArray(int[] nums) {
        int i=0,j=0,min=nums[0],f=0;
        for(i=1;i<nums.length;i++){
            if(nums[i]<min)
                min=nums[i];
        }
        if(min%2==0){
            for(i=0;i<nums.length;i++){
                if(nums[i]!=min && nums[i]%2!=0)
                    nums[i]-=min;
            }
            for(i=0;i<nums.length;i++){
                if(nums[i]%2!=0)
                {
                    f=1;break;
                }
            }
        }
        else{
            for(i=0;i<nums.length;i++){
                if(nums[i]!=min && nums[i]%2==0)
                    nums[i]-=min;
            }
            for(i=0;i<nums.length;i++){
                if(nums[i]%2==0)
                {
                    f=1;break;
                }
            }
        }
        return f==0;
    }
}