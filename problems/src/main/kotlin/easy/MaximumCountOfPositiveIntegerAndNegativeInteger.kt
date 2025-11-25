package easy

/**
 * Given an array nums sorted in non-decreasing order, return the maximum between the number of positive integers
 * and the number of negative integers.
 *
 * * In other words, if the number of positive integers in nums is pos and the number of negative integers is neg
 * , then return the maximum of pos and neg.
 * Note that 0 is neither positive nor negative.
 *
 * [URL](https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/)
 */
object MaximumCountOfPositiveIntegerAndNegativeInteger {
    fun maximumCount(nums: IntArray): Int {
        val posStart = findMinPos(nums)
        val negEnd = findMaxNeg(nums)

        return maxOf(posStart, nums.size - negEnd)
    }

    private fun findMinPos(nums: IntArray): Int {
        var start = 0
        var end = nums.size - 1
        var index = nums.size

        while (start <= end) {
            val mid = (end - start) / 2 + start
            val num = nums[mid]
            if (num < 0) {
                start = mid + 1
            } else {
                end = mid - 1
                index = mid
            }
        }
        return index
    }

    private fun findMaxNeg(nums: IntArray): Int {
        var start = 0
        var end = nums.size - 1
        var index = nums.size

        while (start <= end) {
            val mid = (end - start) / 2 + start
            val num = nums[mid]
            if (num <= 0) {
                start = mid + 1
            } else {
                end = mid - 1
                index = mid
            }
        }
        return index
    }
}
