package arrays.easy

/**
 * You are given a binary array nums (0-indexed).
 *
 * We define xi as the number whose binary representation is the subarray `nums[0..i]`
 * (from most-significant-bit to least-significant-bit).
 *
 * * For example, if `nums = [1,0,1]`, then x0 = 1, x1 = 2, and x2 = 5.
 *
 * Return an array of booleans answer where `answer[i]` is true if xi is divisible by 5.
 *
 * [URL](https://leetcode.com/problems/binary-prefix-divisible-by-5/)
 */
object BinaryPrefixDivisibleBy5 {
    fun prefixesDivBy5(nums: IntArray): List<Boolean> {
        val result = ArrayList<Boolean>(nums.size)

        var curr = 0

        for (n in nums) {
            curr = ((curr shl 1) + n) % 5

            result.add(curr == 0)
        }
        return result
    }
}
