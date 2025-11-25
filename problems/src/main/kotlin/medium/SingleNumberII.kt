package medium

/**
 * Given an integer array nums where every element appears three times except for one, which appears exactly once.
 * Find the single element and return it.
 *
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 *
 * [URL](https://leetcode.com/problems/single-number-ii/)
 */
object SingleNumberII {
    fun singleNumber(nums: IntArray): Int {
        var x1 = 0
        var x2 = 0
        var mask = 0

        for (n in nums) {
            x2 = x2 xor (x1 and n)
            x1 = x1 xor n
            mask = (x1 and x2).inv()
            x2 = x2 and mask
            x1 = x1 and mask
        }

        return x1
    }
}