class Solution {
    public int[] shuffle(int[] nums, int n) {
        int newArr[]=new int[2*n];
        int i,a=0;
        for(i=0;i<nums.length;i+=2)
            newArr[i]=nums[a++];
        a=n;
        for(i=1;i<nums.length;i+=2)
            newArr[i]=nums[a++];
        return newArr;
    }
}