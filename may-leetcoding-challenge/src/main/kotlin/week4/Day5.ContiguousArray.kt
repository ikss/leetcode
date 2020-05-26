package week4

object ContiguousArray {
    fun findMaxLength(nums: IntArray): Int {
        var result = 0
        val cumulativeMap = mutableMapOf<Int, Int>()
        cumulativeMap[0] = -1
        var cumulativeSum = 0
        for (i in nums.indices) {
            if (nums[i] == 0) {
                cumulativeSum--
            } else {
                cumulativeSum++
            }
            val existingIndex = cumulativeMap.putIfAbsent(cumulativeSum, i)
            if (existingIndex != null && i - existingIndex > result) {
                result = i - existingIndex
            }
        }
        return result
    }
}
