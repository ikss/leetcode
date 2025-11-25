package medium

/**
 * You are given an integer array nums and two integers k and numOperations.
 *
 * You must perform an operation numOperations times on nums, where in each operation you:
 * * Select an index i that was not selected in any previous operations.
 * * Add an integer in the range `[-k, k]` to `nums[i]`.
 *
 * Return the maximum possible frequency of any element in nums after performing the operations.
 *
 * [URL](https://leetcode.com/problems/maximum-frequency-of-an-element-after-performing-operations-i/)
 */
object MaximumFrequencyOfElementAfterPerformingOperationsI {

    fun maxFrequency(nums: IntArray, k: Int, numOperations: Int): Int {
        nums.sort()

        var result = 0
        val numCount = HashMap<Int, Int>()

        var lastNumIndex = 0
        for (i in nums.indices) {
            if (nums[i] != nums[lastNumIndex]) {
                numCount[nums[lastNumIndex]] = i - lastNumIndex
                result = maxOf(result, i - lastNumIndex)
                lastNumIndex = i
            }
        }

        numCount[nums[lastNumIndex]] = nums.size - lastNumIndex
        result = maxOf(result, nums.size - lastNumIndex)

        for (i in nums[0]..nums[nums.size - 1]) {
            val l = leftBound(nums, i - k)
            val r = rightBound(nums, i + k)
            val tempAns: Int
            if (numCount.containsKey(i)) {
                tempAns = minOf(r - l + 1, numCount.get(i)!! + numOperations)
            } else {
                tempAns = minOf(r - l + 1, numOperations)
            }
            result = maxOf(result, tempAns)
        }

        return result
    }

    private fun leftBound(nums: IntArray, value: Int): Int {
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

    private fun rightBound(nums: IntArray, value: Int): Int {
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
