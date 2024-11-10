package arrays.medium

/**
 * You are given an array nums of non-negative integers and an integer k.
 *
 * An array is called special if the bitwise OR of all of its elements is at least k.
 *
 * Return the length of the shortest special non-empty subarray of nums, or return -1 if no special subarray exists.
 *
 * [URL](https://leetcode.com/problems/shortest-subarray-with-or-at-least-k-ii/)
 */
object ShortestSubarrayWithORAtLeastKII {
    fun minimumSubarrayLength(nums: IntArray, k: Int): Int {
        var result = Int.MAX_VALUE

        val bits = IntArray(32)
        var left = 0

        for (right in nums.indices) {
            addBits(nums[right], bits)
            while (left <= right && mapToNumber(bits) >= k) {
                if (right == left) return 1
                result = minOf(result, right - left + 1)
                removeBits(nums[left++], bits)
            }
        }

        return if (result == Int.MAX_VALUE) -1 else result
    }

    private fun addBits(num: Int, bits: IntArray) {
        for (i in bits.indices) {
            if (num and (1 shl i) > 0) {
                bits[i]++
            }
        }
    }

    private fun removeBits(num: Int, bits: IntArray) {
        for (i in bits.indices) {
            if (num and (1 shl i) > 0) {
                bits[i]--
            }
        }
    }

    private fun mapToNumber(bits: IntArray): Int {
        var result = 0
        for (i in bits.indices) {
            if (bits[i] > 0) {
                result = result or (1 shl i)
            }
        }

        return result
    }
}
