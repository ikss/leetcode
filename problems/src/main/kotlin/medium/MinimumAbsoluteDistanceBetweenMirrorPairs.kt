package medium

import data_structures.TreeNode

/**
 * You are given an integer array nums.
 *
 * A mirror pair is a pair of indices (i, j) such that:
 *
 * * 0 <= i < j < nums.length, and
 * * reverse(`nums[i]) == nums[j]`, where reverse(x) denotes the integer formed by reversing the digits of x.
 * Leading zeros are omitted after reversing, for example reverse(120) = 21.
 * Return the minimum absolute distance between the indices of any mirror pair.
 * The absolute distance between indices i and j is abs(i - j).
 *
 * If no mirror pair exists, return -1.
 *
 * [URL](https://leetcode.com/problems/minimum-absolute-distance-between-mirror-pairs/)
 */
object MinimumAbsoluteDistanceBetweenMirrorPairs {
    fun minMirrorPairDistance(nums: IntArray): Int {
        val map = HashMap<Int, Int>()

        var result = Int.MAX_VALUE

        for (i in nums.indices) {
            val n = nums[i]
            val reversed = reverse(n)

            val prev = map[n]
            if (prev != null) {
                result = minOf(result, i - prev)
            }
            map[reversed] = i
        }

        return if (result == Int.MAX_VALUE) -1 else result
    }

    private fun reverse(num: Int): Int {
        var n = num
        var result = 0

        while (n > 0) {
            val digit = n % 10
            n /= 10

            if (digit == 0 && result == 0) continue
            result *= 10
            result += digit
        }

        return result
    }
}
