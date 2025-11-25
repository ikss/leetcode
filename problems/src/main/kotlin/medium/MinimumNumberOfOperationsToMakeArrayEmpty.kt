package medium

/**
 * You are given a 0-indexed array nums consisting of positive integers.
 *
 * There are two types of operations that you can apply on the array any number of times:
 * * Choose two elements with equal values and delete them from the array.
 * * Choose three elements with equal values and delete them from the array.
 *
 * Return the minimum number of operations required to make the array empty, or -1 if it is not possible.
 *
 * [URL](https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/)
 */
object MinimumNumberOfOperationsToMakeArrayEmpty {
    fun minOperations(nums: IntArray): Int {
        val count = HashMap<Int, Int>()
        for (n in nums) {
            count.merge(n, 1, Integer::sum)
        }

        var result = 0

        for ((_, c) in count) {
            if (c == 1) {
                return -1
            }
            result += Math.ceil(c.toDouble() / 3).toInt()
        }

        return result
    }
}
