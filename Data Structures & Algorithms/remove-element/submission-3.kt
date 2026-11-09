class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var l=0
        for (r in nums.indices) {
            if (nums[r] != `val`) { // Found v
                nums[l] = nums[r]
                l++
            }
        }
        return l
    }
}

