class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(countDigits(nums[i]))
                c++;
        }
        return c;
    }
    boolean countDigits(int n){
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }
        return count%2==0;
    }
}