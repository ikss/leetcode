package easy

/**
 * You are given an integer array nums and two integers l and r. Your task is to find the minimum sum of a subarray
 * whose size is between l and r (inclusive) and whose sum is greater than 0.
 *
 * Return the minimum sum of such a subarray. If no such subarray exists, return -1.
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 * [URL](https://leetcode.com/problems/minimum-positive-sum-subarray/)
 */
object MinimumPositiveSumSubarray {
    fun minimumSumSubarray(nums: List<Int>, l: Int, r: Int): Int {
        val n = nums.size
        val prefix = IntArray(n + 1)
        for (i in 0..<n) {
            prefix[i + 1] = prefix[i] + nums[i]
        }

        var best = Int.MAX_VALUE
        for (len in l..r) {
            var i = 0
            while (i + len <= n) {
                val sum = prefix[i + len] - prefix[i]
                if (sum in 1..<best) {
                    best = sum
                }
                i++
            }
        }

        return if (best == Int.MAX_VALUE) -1 else best
    }
}
