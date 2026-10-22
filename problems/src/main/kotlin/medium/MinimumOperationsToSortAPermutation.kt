package medium

/**
 * You are given an integer array nums of length n, where nums is a permutation of the integers from 0 to n - 1.
 *
 * You may perform only the following operations:
 * * Reverse the entire array.
 * * Rotate Left by One: Move the first element to the end of the array, and rest elements to left by one position.
 *
 * Return an integer denoting the minimum number of operations required to sort the array in increasing order.
 * If it is not possible to sort the array using only the given operations, return -1.
 *
 * [URL](https://leetcode.com/problems/boats-to-save-people/)
 */
object MinimumOperationsToSortAPermutation {
    fun minOperations(nums: IntArray): Int {
        var descends = 0
        var ascends = 0

        var min = nums[0]
        var max = nums[0]
        var minIndex = 0
        var maxIndex = 0

        for (i in 1 until nums.size) {
            val n = nums[i]

            if (nums[i - 1] > n) {
                descends++
            }
            if (nums[i - 1] < n) {
                ascends++
            }
            if (n < min) {
                min = n
                minIndex = i
            }
            if (n > max) {
                max = n
                maxIndex = i
            }
        }

        if (nums[0] < nums[nums.size - 1]) {
            descends++
        }

        if (nums[0] > nums[nums.size - 1]) {
            ascends++
        }

        var result = Int.MAX_VALUE
        if (descends < 2) {
            result = minOf(minIndex, nums.size - maxIndex + 1)
        }
        if (ascends < 2) {
            result = minOf(result, maxIndex + 1, nums.size - minIndex)
        }

        return if (result == Int.MAX_VALUE) -1 else result
    }
}
