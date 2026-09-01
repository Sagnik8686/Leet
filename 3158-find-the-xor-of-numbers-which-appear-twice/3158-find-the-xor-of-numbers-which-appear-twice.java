class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int arr[]=new int[51];
        int i,x=0;
        for(i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]==2)
                x=x^i;
        }
        return x;
    }
}