class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        var p = 0
        var n = arr.size
        for (i in 0..<n-1) {
            var maxInRightSubArray = arr[i+1]
            for (j in (i + 1)..<n) {
                maxInRightSubArray = max(maxInRightSubArray, arr[j])
            }
            arr[i] = maxInRightSubArray
        }
        arr[n-1] = -1
        return arr
    }
}
