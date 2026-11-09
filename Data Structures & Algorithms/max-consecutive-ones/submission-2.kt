class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var count = 0
        var maxCount = 0
        for (e in nums) {
            if (e == 1) {
                count++
            } else {
                count = 0
            }
            maxCount = Math.max(maxCount, count)
        }
        return maxCount
    }
}
