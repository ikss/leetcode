package hard

import java.util.*

/**
 * You are given an integer array nums and two integers k and numOperations.
 *
 * You must perform an operation numOperations times on nums, where in each operation you:
 * *Select an index i that was not selected in any previous operations.
 * *Add an integer in the range `[-k, k]` to `nums[i]`.
 *
 * Return the maximum possible frequency of any element in nums after performing the operations.
 *
 * [URL](https://leetcode.com/problems/maximum-frequency-of-an-element-after-performing-operations-ii/)
 */
object MaximumFrequencyOfElementAfterPerformingOperationsII {

    fun maxFrequency(nums: IntArray, k: Int, numOperations: Int): Int {
        nums.sort()
        var result = 0

        val numCount = HashMap<Int, Int>()
        val modes = TreeSet<Int>()

        fun addMode(value: Int) {
            modes.add(value)
            if (value - k >= nums[0]) {
                modes.add(value - k)
            }
            if (value + k <= nums[nums.size - 1]) {
                modes.add(value + k)
            }
        }

        var lastNumIndex = 0
        var lastValue = nums[lastNumIndex]
        for (i in nums.indices) {
            if (nums[i] == lastValue) continue

            numCount[lastValue] = i - lastNumIndex
            result = maxOf(result, i - lastNumIndex)
            addMode(lastValue)
            lastNumIndex = i
            lastValue = nums[lastNumIndex]
        }

        numCount[lastValue] = nums.size - lastNumIndex
        result = maxOf(result, nums.size - lastNumIndex)
        addMode(lastValue)

        for (mode in modes) {
            val l = leftBound(mode - k, nums)
            val r = rightBound(mode + k, nums)
            val count = numCount.getOrDefault(mode, 0)
            val tempAns = minOf(r - l + 1, count + numOperations)
            result = maxOf(result, tempAns)
        }

        return result
    }


    private fun leftBound(value: Int, nums: IntArray): Int {
        var left = 0
        var right = nums.size - 1
        while (left < right) {
            val mid = (left + right) / 2
            if (nums[mid] < value) {
                left = mid + 1
            } else {
                right = mid
            }
        }
        return left
    }

    private fun rightBound(value: Int, nums: IntArray): Int {
        var left = 0
        var right = nums.size - 1
        while (left < right) {
            val mid = (left + right + 1) / 2
            if (nums[mid] > value) {
                right = mid - 1
            } else {
                left = mid
            }
        }
        return left
    }
}
