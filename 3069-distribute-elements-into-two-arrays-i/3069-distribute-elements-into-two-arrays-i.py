class Solution:
    def resultArray(self, nums: List[int]) -> List[int]:
        a=[nums[0]]
        b=[nums[1]]
        for i in range(2,len(nums)):
            if(a[len(a)-1]>b[len(b)-1]):
                a.append(nums[i])
            else:
                b.append(nums[i])
        for i in b:
            a.append(i)
        return a