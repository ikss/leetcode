package medium

/**
 * Given an integer array nums, in which exactly two elements appear only once and all the other elements appear
 * exactly twice. Find the two elements that appear only once. You can return the answer in any order.
 *
 * You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.
 *
 * [URL](https://leetcode.com/problems/single-number-iii/)
 */
object SingleNumberIII {
    fun singleNumber(nums: IntArray): IntArray {
        var bitmask = 0
        for (num in nums) {
            bitmask = bitmask xor num
        }

        // rightmost 1-bit diff between x and y
        val diff = bitmask and (-bitmask)

        var x = 0
        // bitmask which will contain only x
        for (num in nums) {
            if ((num and diff) != 0) {
                x = x xor num
            }
        }

        return intArrayOf(x, bitmask xor x)
    }
}