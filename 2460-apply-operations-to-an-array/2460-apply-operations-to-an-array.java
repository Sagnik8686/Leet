class Solution {
    public int[] applyOperations(int[] nums) {
        int i,a=0;
        for (i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }
        
        // for(i=0;i<nums.length;i++){
        //     if(nums[i]==0)
        //         count++;
        // }
        for(i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[a]=nums[i];
                a++;
            }
        }
        for(i=a;i<nums.length;i++){
            nums[i]=0;
        }
        return nums;
    }
}