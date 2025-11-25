package medium


/**
 * You are given an integer array nums and an integer k.
 *
 * You are allowed to perform the following operation on each element of the array at most once:
 *
 * * Add an integer in the range [-k, k] to the element.
 *
 * Return the maximum possible number of distinct elements in nums after performing the operations.
 *
 * [URL](https://leetcode.com/problems/maximum-number-of-distinct-elements-after-operations/)
 */
object MaximumNumberOfDistinctElementsAfterOperations {
    fun maxDistinctElements(nums: IntArray, k: Int): Int {
        nums.sort()
        var result = 0
        var prev = Int.MIN_VALUE
        for (num in nums) {
            val nextForPrev = maxOf(num - k, prev + 1)
            val curr = minOf(nextForPrev, num + k)
            if (curr > prev) {
                result++
                prev = curr
            }
        }
        return result
    }
}