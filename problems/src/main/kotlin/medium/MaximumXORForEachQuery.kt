package medium

/**
 * You are given a sorted array nums of n non-negative integers and an integer maximumBit.
 * You want to perform the following query n times:
 * * Find a non-negative integer k < 2maximumBit such that `nums[0] XOR nums[1] XOR ... XOR nums[nums.length-1] XOR k`
 * is maximized. k is the answer to the ith query.
 * * Remove the last element from the current array nums.
 * 
 * Return an array answer, where `answer[i]` is the answer to the ith query.
 *
 * [URL](https://leetcode.com/problems/maximum-xor-for-each-query/)
 */
object MaximumXORForEachQuery {
    fun getMaximumXor(nums: IntArray, maximumBit: Int): IntArray {
        val n = nums.size
        val mask = (1 shl maximumBit) - 1

        val result = IntArray(n)

        var xored = nums[0]

        for (i in 1 until n) {
            xored = xored xor nums[i]
        }

        for (i in 0 until n) {
            result[i] = xored xor mask
            xored = xored xor nums[n - 1 - i]
        }

        return result
    }
}
