class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length,i,a=0,b=0;
        int arr[]=new int[m+n];
        for(i=0;i<m+n;i++){
            if(a==m)
            {
                arr[i]=nums2[b];b++;
            }
            else if(b==n){
                arr[i]=nums1[a];a++;
            }
            else if(nums1[a]<nums2[b]){
                arr[i]=nums1[a];a++;
            }
            else{
                arr[i]=nums2[b];b++;
            }
        }
        int mid=(m+n)/2;
        if((m+n)%2!=0)
            return (float)arr[mid];
        else
            return ((arr[mid]+arr[mid-1])/2.0);
    }
}