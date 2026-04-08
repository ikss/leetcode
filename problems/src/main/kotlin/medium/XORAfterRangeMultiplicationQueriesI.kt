package medium

/**
 * You are given an integer array nums of length n and a 2D integer array queries of size q, where queries[i] = [li, ri, ki, vi].
 *
 * For each query, you must apply the following operations in order:
 *
 * * Set idx = li.
 * * While idx <= ri:
 * * * Update: `nums[idx] = (nums[idx] * vi) % (10^9 + 7)`
 * * * Set idx += ki.
 *
 * Return the bitwise XOR of all elements in nums after processing all queries.
 *
 * [URL](https://leetcode.com/problems/xor-after-range-multiplication-queries-i/)
 */
object XORAfterRangeMultiplicationQueriesI {
    fun xorAfterQueries(nums: IntArray, queries: Array<IntArray>): Int {
        val multipliers = LongArray(nums.size) { 1L }
        val mod = 1_000_000_007

        for ((l, r, k, v) in queries) {
            var i = l
            while (i <= r) {
                multipliers[i] *= v
                multipliers[i] %= mod
                i += k
            }
        }

        var result = 0

        for (i in nums.indices) {
            val n = nums[i]
            val resNum = ((multipliers[i] * n) % mod).toInt()
            result = result xor resNum
        }
        return result
    }
}