class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int newArr[] = new int[m + n];
        if (n != 0 ) {
            int a = 0, b = 0, i;
            for (i = 0; i < m + n; i++) {
                if(a==m){
                    newArr[i]=nums2[b];b++;}
                else if(b==n){
                    newArr[i]=nums1[a];a++;}
                else if(nums1[a]<nums2[b]){
                    newArr[i]=nums1[a];a++;
                }
                else
                {
                    newArr[i]=nums2[b];b++;
                }
            }
            for (i = 0; i < m + n; i++) {
                nums1[i] = newArr[i];
            }
        }
    }
}