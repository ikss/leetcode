package medium


/**
 * You are given an integer array nums of length n.
 *
 * An integer k is called sortable if k divides n and you can sort nums in non-decreasing order by sequentially performing the following operations:
 * * Partition nums into consecutive subarrays of length k.
 * * Cyclically rotate each subarray independently any number of times to the left or to the right.
 * Return an integer denoting the sum of all possible sortable integers k.
 *
 * [URL](https://leetcode.com/problems/sum-of-sortable-integers/)
 */
object SumOfSortableIntegers {
    fun sortableIntegers(nums: IntArray): Int {
        val n = nums.size
        val fac = getFactorials(n)
        var result = 0

        for (i in fac) {
            if (canSort(nums, i)) {
                result += i
            }
        }

        return result
    }

    private fun getFactorials(n: Int): ArrayList<Int> {
        val result = ArrayList<Int>()

        var x = 1
        while (x * x <= n) {
            if (n % x == 0) {
                result.add(x)
                if (n / x != x) {
                    result.add(n / x)
                }
            }
            x++
        }
        return result
    }

    private fun canSort(nums: IntArray, window: Int): Boolean {
        var max = Int.MIN_VALUE

        var start = 0
        var end = window

        while (end <= nums.size) {
            var decreases = 0
            var currMin = nums[start]
            var currMax = nums[start]

            for (i in start until end - 1) {
                if (nums[i] > nums[i + 1]) {
                    decreases++
                }
                currMin = minOf(currMin, nums[i])
                currMax = maxOf(currMax, nums[i])
            }
            currMin = minOf(currMin, nums[end - 1])
            currMax = maxOf(currMax, nums[end - 1])
            if (nums[end - 1] > nums[start]) {
                decreases++
            }

            if (currMin < max || currMax < max || decreases > 1) {
                return false
            }
            max = currMax
            start = end
            end += window
        }

        return true
    }
}
