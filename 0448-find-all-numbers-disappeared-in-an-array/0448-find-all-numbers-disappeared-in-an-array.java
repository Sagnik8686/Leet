class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list1=new ArrayList<>();
        int arr[]=new int[nums.length+1];
        int i;
        for(i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        for(i=1;i<arr.length;i++){
            if(arr[i]==0)
                list1.add(i);
        }
        return list1;
    }
}