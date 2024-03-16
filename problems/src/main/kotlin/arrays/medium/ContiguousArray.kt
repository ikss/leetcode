package arrays.medium

/**
 * Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
 *
 * [URL](https://leetcode.com/problems/contiguous-array/)
 */
object ContiguousArray {
    fun findMaxLength(nums: IntArray): Int {
        var result = 0
        val prevSumIndex = HashMap<Int, Int>()
        prevSumIndex[0] = -1
        var count = 0

        for (i in nums.indices) {
            if (nums[i] == 1) {
                count++
            } else {
                count--
            }
            val last = prevSumIndex[count]
            if (last == null) {
                prevSumIndex[count] = i
            } else {
                result = maxOf(result, i - last)
            }
        }
        return result
    }
}
