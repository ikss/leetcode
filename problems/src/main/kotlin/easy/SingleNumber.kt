package easy

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 *
 * [URL](https://leetcode.com/problems/single-number/)
 */
object SingleNumber {
    fun singleNumber(nums: IntArray): Int {
        var result = 0
        nums.forEach {
            result = result.xor(it)
        }
        return result
    }
}
