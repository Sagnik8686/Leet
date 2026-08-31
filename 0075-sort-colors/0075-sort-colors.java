class Solution {
    public void sortColors(int[] nums) {
        int i;
        int red=0, white=0, blue =0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==0)
                red++;
            else if(nums[i]==1) 
                white++;
            else
                blue++; 
        }
        white+=red;
        blue+=white;
        for(i=0;i<nums.length;i++){
            if(i<red)
                nums[i]=0;
            else if(i<white)
                nums[i]=1;
            else
                nums[i]=2;    
        }
    }
}