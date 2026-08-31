class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10)
                sum+=nums[i];
            else
                sum+=encrypt(String.valueOf(nums[i]));
        }
        return sum;
        
    }
    static int encrypt(String s){
        String max="";char m=s.charAt(0);int i;
        for(i=1;i<s.length();i++){
            if(m<s.charAt(i))
                m=s.charAt(i);
        }
        for(i=0;i<s.length();i++){
            max+=m;
        }
        return Integer.parseInt(max);
    }
}