package arrays.medium

/**
 * You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.
 *
 * You should rearrange the elements of nums such that the modified array follows the given conditions:
 * * Every consecutive pair of integers have opposite signs.
 * * For all integers with the same sign, the order in which they were present in nums is preserved.
 * * The rearranged array begins with a positive integer.
 *
 * Return the modified array after rearranging the elements to satisfy the aforementioned conditions.
 *
 * [URL](https://leetcode.com/problems/rearrange-array-elements-by-sign/)
 */
object RearrangeArrayElementsBySign {
    fun rearrangeArray(nums: IntArray): IntArray {
        var neg = 1
        var pos = 0
        val result = IntArray(nums.size)

        for (n in nums) {
            if (n < 0) {
                result[neg] = n
                neg += 2
            } else {
                result[pos] = n
                pos += 2
            }
        }
        return result
    }
}