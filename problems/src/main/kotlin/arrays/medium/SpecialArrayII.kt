package arrays.medium

/**
 * An array is considered special if every pair of its adjacent elements contains two numbers with different parity.
 *
 * You are given an array of integer nums and a 2D integer matrix queries, where for `queries[i] = [fromi, toi]`
 * your task is to check that subarray `nums[fromi..toi]` is special or not.
 *
 * Return an array of booleans answer such that `answer[i]` is true if `nums[fromi..toi]` is special.
 *
 * [URL](https://leetcode.com/problems/special-array-ii/)
 */
object SpecialArrayII {
    fun isArraySpecial(nums: IntArray, queries: Array<IntArray>): BooleanArray {
        val pairs = ArrayList<Pair<Int, Int>>()

        for (i in 0 until nums.size - 1) {
            val first = nums[i] % 2
            val second = nums[i + 1] % 2
            if (first == second) {
                pairs.add(i to i + 1)
            }
        }
        val result = BooleanArray(queries.size)
        for (i in queries.indices) {
            val (start, end) = queries[i]
            var valid = true
            for ((l, r) in pairs) {
                if (l < start) continue
                if (r > end) break
                if (l < end && r > start) {
                    valid = false
                    break
                }
            }
            if (valid) {
                result[i] = true
            }
        }
        return result
    }
}
