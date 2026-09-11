class Solution {
    public int totalNumbers(int[] digits) {
        int num,c=0;
        boolean[] seen = new boolean[1000];
        for(int i=0;i<digits.length;i++){
            for(int j=0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++){
                    if(i == j || j == k || i == k)
                        continue;
                    if(digits[i]==0)
                        continue;
                    num=digits[i]*100+digits[j]*10+digits[k];
                    if(num % 2 == 0 && !seen[num]) {
                        c++;
                        seen[num] = true;
                    num=0;
                }
            }
        }
        }
        return c;
        
    }
}