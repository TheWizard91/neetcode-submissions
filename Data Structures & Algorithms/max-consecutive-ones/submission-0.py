class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        e = 0
        currE = 0
        for i in nums:
            if i == 1:
                currE += 1
            else:
                currE = 0
            e = max(e, currE)
        return e
            