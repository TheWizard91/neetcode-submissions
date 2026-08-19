class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        nums.sort()
        s = len(nums)
        if(s<2):
            return False;
        for i in range(0,s-1):
            if nums[i] == nums[i+1]:
                return True
        return False