class Solution {
    public int[] separateDigits(int[] nums) {
        String s="";
        int i;
        for(i=0;i<nums.length;i++){
            s+=Integer.toString(nums[i]);
        }
        int sum[]=new int[s.length()];
        for(i=0;i<s.length();i++){
            sum[i]=s.charAt(i)-'0';
        }
        return sum;
    }
}