class Solution {
    public int minimumDeletions(int[] nums) {
        int smallInd = 0, largeInd = 0;
        int i, l = nums.length;
        if (l == 1)
            return 1;
        for (i = 0; i < l; i++) {
            if (nums[i] > nums[largeInd])
                largeInd = i;
            if (nums[i] < nums[smallInd])
                smallInd = i;
        }
        int a = Math.max(smallInd + 1, largeInd + 1);
        int b = Math.max(l - smallInd, l - largeInd);
        int c = smallInd + 1 + l - largeInd;
        int d = largeInd + 1 + l - smallInd;

        return Math.min(Math.min(a, b), Math.min(c, d));
    }
}